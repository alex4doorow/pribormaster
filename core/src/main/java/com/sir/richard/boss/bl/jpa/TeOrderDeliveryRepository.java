package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeOrderDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeOrderDeliveryRepository extends JpaRepository<TeOrderDelivery, Long> {

}
