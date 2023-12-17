package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeOrderRepository extends JpaRepository<TeOrder, Long> {

    @Query("SELECT MAX(te.orderNo) FROM TeOrder te")
    Integer findMaxOrderNo();




}
