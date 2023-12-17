package com.sir.richard.boss.model.data.conditions;

import com.sir.richard.boss.model.data.Product;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderConditions extends AnyConditions {
    private int customerId;
    private String no;
    private String crmNo;
    //private CustomerConditions customerConditions;
    private String trackCode;
    private String deliveryAddress;
    private Product product;
    private boolean periodExist;
    private boolean trackCodeNotExist;
}
