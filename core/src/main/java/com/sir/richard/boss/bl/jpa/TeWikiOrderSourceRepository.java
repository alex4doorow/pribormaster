package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeWikiOrderSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeWikiOrderSourceRepository extends JpaRepository<TeWikiOrderSource, Long> {
}

