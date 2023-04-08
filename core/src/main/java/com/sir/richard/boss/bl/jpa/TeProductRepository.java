package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeProductRepository extends JpaRepository<TeProduct, Long> {
}
