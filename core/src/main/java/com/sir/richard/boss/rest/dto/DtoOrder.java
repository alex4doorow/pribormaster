package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sir.richard.boss.model.types.*;
import com.sir.richard.boss.utils.DateTimeUtils;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class DtoOrder {

    private Long id;
    private Integer orderNo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATE_FORMAT_yyyy_MM_dd)
    private LocalDate orderDate;

    private OrderTypes type;
    private DtoCustomer customer;

    private DtoProductCategory productCategory = new DtoProductCategory();
    private OrderSourceTypes source;
    private OrderAdvertTypes advert;
    private PaymentTypes payment;
    private StoreTypes store;
    private OrderStatuses status;
    private OrderEmailStatuses emailStatus;

    private DtoOrderDelivery delivery = new DtoOrderDelivery();

    private Map<OrderAmountTypes, BigDecimal> amounts = new HashMap<>();

    private List<DtoOrderItem> items = new ArrayList<>();
    private List<DtoOrderStatusItem> statuses = new ArrayList<>();

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATA_FORMAT_UTC)
    private LocalDateTime addedDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATA_FORMAT_UTC)
    private LocalDateTime modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String annotation;
}
