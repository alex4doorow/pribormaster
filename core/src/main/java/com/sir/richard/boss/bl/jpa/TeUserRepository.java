package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeUserRepository extends JpaRepository<TeUser, Long> {
    TeUser findByUsername(String username);
}
