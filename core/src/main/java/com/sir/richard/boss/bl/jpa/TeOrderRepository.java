package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeOrderRepository extends JpaRepository<TeOrder, Long> {
}
