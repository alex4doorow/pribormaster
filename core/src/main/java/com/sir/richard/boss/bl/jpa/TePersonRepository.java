package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TePersonRepository extends JpaRepository<TePerson, Long> {
}

