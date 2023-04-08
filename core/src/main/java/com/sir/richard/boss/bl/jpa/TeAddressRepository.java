package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeAddressRepository extends JpaRepository<TeAddress, Long> {
}
