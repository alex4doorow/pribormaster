package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeWikiProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeWikiProductCategoryRepository extends JpaRepository<TeWikiProductCategory, Long> {
}
