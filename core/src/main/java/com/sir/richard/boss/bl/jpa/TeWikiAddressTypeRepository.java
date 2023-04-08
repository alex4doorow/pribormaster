package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeWikiAddressType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeWikiAddressTypeRepository extends JpaRepository<TeWikiAddressType, Long> {
}

