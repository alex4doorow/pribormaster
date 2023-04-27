package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sir.richard.boss.model.types.CrmStatuses;
import com.sir.richard.boss.model.types.CrmTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoOrderExternalCrm {
    private CrmTypes type;
    private CrmStatuses status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long parentId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String parentCode;
}
