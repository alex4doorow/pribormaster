package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeWikiOrderAdvert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeWikiOrderAdvertRepository extends JpaRepository<TeWikiOrderAdvert, Long> {
}
