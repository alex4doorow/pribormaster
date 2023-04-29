package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Data
@NoArgsConstructor
public class DtoCompanyCustomer {
    private String inn;
    private String shortName;
    private String longName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DtoPerson> contacts;

    @JsonIgnore
    public String getViewLongName() {
        String viewLongName = StringUtils.isNotEmpty(this.longName) ? longName : this.shortName;
        viewLongName = viewLongName.trim();
        if (StringUtils.isEmpty(this.inn)) {
            return viewLongName;
        } else {
            return "ИНН " + this.inn + " " + StringUtils.defaultString(viewLongName);
        }
    }

    @JsonIgnore
    public DtoPerson getMainContact() {
        if (contacts.size() == 0) {
            return DtoPerson.createEmpty();
        } else {
            return contacts.get(0);
        }
    }
}
