package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sir.richard.boss.model.types.OrderStatuses;
import com.sir.richard.boss.utils.DateTimeUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoOrderStatusItem {

    private Long id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer no;
    private OrderStatuses status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String crmStatus;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String crmSubStatus;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATE_FORMAT_UTC)
    private LocalDateTime addedDate;

}
