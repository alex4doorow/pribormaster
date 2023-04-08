package com.sir.richard.boss.bl.jpa;

import com.sir.richard.boss.bl.entity.TeCustomer;
import com.sir.richard.boss.bl.entity.TeCustomerCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeCustomerRepository extends JpaRepository<TeCustomer, Long> {

    @Query("SELECT MAX(cc) FROM TeCustomerCompany cc WHERE (cc.customer.id = :customerId)")
    TeCustomerCompany findCustomerCompanyByCustomerId(@Param("customerId") Long customerId);
}
