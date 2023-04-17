package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DtoCompanyCustomer {
    private String inn;
    private String shortName;
    private String longName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DtoPerson> contacts;

    public String getShortName() {
        return shortName;
    }
}
