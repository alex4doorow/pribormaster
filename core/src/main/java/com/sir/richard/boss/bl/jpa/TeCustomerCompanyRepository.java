package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeCustomerCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeCustomerCompanyRepository extends JpaRepository<TeCustomerCompany, Long> {
/*
    @Query("SELECT MAX(r) FROM SEReport r, SEDocument d" +
            " WHERE (d = r.document) AND (r.status = 'P') AND (d.correlationId = :corrId)")
    SEReport findPendingReportByCorrId(@Param("corrId") String correlationId);

 */
}
