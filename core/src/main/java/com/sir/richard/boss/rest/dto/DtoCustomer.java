package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sir.richard.boss.model.types.CustomerTypes;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class DtoCustomer {

    private Long id;
    private CustomerTypes type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DtoCompanyCustomer company;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DtoPerson person;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DtoAddress address;

    @JsonIgnore
    public String getViewShortName() {
        if (type == CustomerTypes.CUSTOMER) {
            return person.getShortName();
        } else if (type == CustomerTypes.COMPANY) {
            return company.getShortName();
        } else {
            return "Unknown";
        }
    }

    @JsonIgnore
    public String getViewLongName() {
        if (type == CustomerTypes.CUSTOMER) {
            return person.getViewLongName();
        } else if (type == CustomerTypes.COMPANY) {
            return company.getViewLongName();
        } else {
            return "Unknown";
        }
    }

    @JsonIgnore
    public String getViewLongNameWithContactInfo() {
        String viewLongName = getViewLongName();
        if (type == CustomerTypes.CUSTOMER || type == CustomerTypes.FOREIGNER_CUSTOMER) {
            return viewLongName + ", " + person.getPhoneNumber();
        } else if (type == CustomerTypes.COMPANY || type == CustomerTypes.FOREIGNER_COMPANY || type == CustomerTypes.BUSINESSMAN) {
            String contact = company.getMainContact().getViewLongName() + " " + company.getMainContact().getEmail();
            return viewLongName.trim() + ", " + contact;
        } else {
            return viewLongName;
        }
    }

    @JsonIgnore
    public String getViewPhoneNumber() {
        if (type == CustomerTypes.CUSTOMER || type == CustomerTypes.FOREIGNER_CUSTOMER) {
            return person.getPhoneNumber();
        } else if (type == CustomerTypes.COMPANY || type == CustomerTypes.FOREIGNER_COMPANY || type == CustomerTypes.BUSINESSMAN) {
            if (company.getContacts().size() > 0) {
                return company.getContacts().get(0).getPhoneNumber();
            } else {
                return "(000) 000-00-00";
            }
        } else {
            return "(000) 000-00-00";
        }
    }

    @JsonIgnore
    public String getViewEmail() {
        if (type == CustomerTypes.CUSTOMER) {
            return person.getEmail();
        } else if (type == CustomerTypes.COMPANY || type == CustomerTypes.FOREIGNER_COMPANY || type == CustomerTypes.BUSINESSMAN) {
            if (company.getContacts().size() > 0) {
                return company.getContacts().get(0).getEmail();
            } else {
                return "unknown@gmail.com";
            }
        } else {
            return "unknown@gmail.com";
        }
    }
}
