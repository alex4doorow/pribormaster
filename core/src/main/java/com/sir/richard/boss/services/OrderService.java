package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.core.CoreException;
import com.sir.richard.boss.bl.entity.TeOrder;
import com.sir.richard.boss.bl.entity.TeOrderStatusItem;
import com.sir.richard.boss.bl.jpa.TeCustomerRepository;
import com.sir.richard.boss.bl.jpa.TeOrderRepository;
import com.sir.richard.boss.bl.jpa.TeOrderStatusItemRepository;
import com.sir.richard.boss.bl.jpa.TePersonRepository;
import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.services.converters.in.model.InOrderConverter;
import com.sir.richard.boss.services.converters.out.model.OutOrderConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
@Service
public class OrderService {

    @Autowired
    private EntityManager entityManager;
    @Autowired
    private TePersonRepository personRepository;
    @Autowired
    private TeCustomerRepository customerRepository;
    @Autowired
    private TeOrderRepository orderRepository;
    @Autowired
    private TeOrderStatusItemRepository orderStatusItemRepository;
    @Autowired
    private OutOrderConverter outOrderConverter;
    @Autowired
    private InOrderConverter inOrderConverter;

    @Transactional
    public Order findById(Long id) {
        Optional<TeOrder> teOptionalOrder = orderRepository.findById(id);
        return teOptionalOrder
                .map(teOrder -> outOrderConverter.convertTo(teOrder))
                .orElse(null);
    }

    @Transactional
    public Long add(Order order) throws CoreException {
        log.info("add: {}", order);

        TeOrder teOrder = new TeOrder();
        teOrder = inOrderConverter.saveTo(order, teOrder);
        try {
            teOrder = orderRepository.save(teOrder);

            TeOrderStatusItem teOrderStatusItem = new TeOrderStatusItem();
            teOrderStatusItem.setOrder(teOrder);
            teOrderStatusItem.setStatus(teOrder.getStatus());
            teOrderStatusItem.setDateAdded(LocalDateTime.now());
            teOrderStatusItem.setUserAdded(teOrder.getUserAdded());
            orderStatusItemRepository.save(teOrderStatusItem);

            return teOrder.getId();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    @Transactional
    public void update(Order order) throws CoreException {
        Optional<TeOrder> teCurrentOrder = orderRepository.findById(order.getId());
        if (teCurrentOrder.isEmpty()) {
            throw new CoreException(CoreException.RECORD_WITH_ID_NOT_FOUND);
        }
        TeOrder teOrder = inOrderConverter.saveTo(order, teCurrentOrder.get());
        orderRepository.save(teOrder);
        log.info("saved: {}", teOrder);
    }

    @Transactional
    public void delete(Long id) throws CoreException {
        orderRepository.deleteById(id);
    }

    public Integer nextOrderNo() {
        return orderRepository.findMaxOrderNo() + 1;
    }
}
