package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.VeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeProductRepository extends JpaRepository<VeProduct, Long> {
}
