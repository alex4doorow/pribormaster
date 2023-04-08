package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeWikiOrderDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeWikiOrderDeliveryRepository extends JpaRepository<TeWikiOrderDelivery, Long> {
}

