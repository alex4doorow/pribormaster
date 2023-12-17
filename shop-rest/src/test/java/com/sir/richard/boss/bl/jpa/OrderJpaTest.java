package com.sir.richard.boss.bl.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class OrderJpaTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private TeOrderRepository orderRepository;

    @Test
    public void testOrderData() {

    }
}
