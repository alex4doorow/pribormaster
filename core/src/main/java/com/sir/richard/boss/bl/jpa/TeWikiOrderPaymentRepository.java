package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeWikiOrderPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeWikiOrderPaymentRepository extends JpaRepository<TeWikiOrderPayment, Long> {
}
