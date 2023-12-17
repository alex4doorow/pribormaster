package com.sir.richard.boss.bl.jpa;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@Slf4j
public class OrderJpaTest {
    @Autowired
    private TestEntityManager entityManager;
    //@Autowired
    //private TeOrderRepository orderRepository;

    @Test
    public void testOrderData() {
        /*
        this.entityManager.persist(new TeOrder());
        orderRepository.findAll().forEach(o -> {
            System.out.println();
        });

        */
    }
}
