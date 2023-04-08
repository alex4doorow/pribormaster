package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoOrderItem {
    private Long id;
    private int no;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DtoProduct product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal discountRate;
    private BigDecimal amount;
    private BigDecimal supplierAmount;
}
