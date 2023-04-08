package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeWikiOrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeWikiOrderStatusRepository extends JpaRepository<TeWikiOrderStatus, Long> {
}

