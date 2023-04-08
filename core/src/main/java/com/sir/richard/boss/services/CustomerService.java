package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.core.CoreException;
import com.sir.richard.boss.bl.jpa.TeCustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Slf4j
public class CustomerService {

    @Autowired
    private TeCustomerRepository customerRepository;

    @Transactional
    public void delete(Long id) throws CoreException {
        customerRepository.deleteById(id);
    }
}
