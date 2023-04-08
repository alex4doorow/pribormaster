package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeWikiOrderPaymentDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeWikiOrderPaymentDeliveryRepository extends JpaRepository<TeWikiOrderPaymentDelivery, Long> {
}

