package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeOrderItemRepository extends JpaRepository<TeOrderItem, Long> {

}
