package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sir.richard.boss.model.types.CustomerTypes;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DtoCustomer {

    private Long id;
    private CustomerTypes type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DtoCompanyCustomer company;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DtoPerson person;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DtoAddress address;

    public String getViewShortName() {
        if (type == CustomerTypes.CUSTOMER) {
            return person.getShortName();
        } else if (type == CustomerTypes.COMPANY) {
            return company.getShortName();
        } else {
            return "Unknown";
        }
    }

    public String getViewPhoneNumber() {
        if (type == CustomerTypes.CUSTOMER) {
            return person.getPhoneNumber();
        } else {
            return "(000) 000-00-00";
        }
    }
}
