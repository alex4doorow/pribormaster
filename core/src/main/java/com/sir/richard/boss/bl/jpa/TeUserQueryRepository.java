package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeUser;
import com.sir.richard.boss.bl.entity.TeUserQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeUserQueryRepository extends JpaRepository<TeUserQuery, Long> {

    @Query("SELECT MAX(uq.value) FROM TeUserQuery uq" +
            " WHERE (uq.user.id = :userId) AND (uq.form = :form) AND (uq.code = :code)")
    String findValueByUserFormCode(@Param("userId") Long userId,
                                   @Param("form") String form,
                                   @Param("code") String code);
}
