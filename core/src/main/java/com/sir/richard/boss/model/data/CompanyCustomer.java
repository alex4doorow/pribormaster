package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.Countries;
import com.sir.richard.boss.model.types.CustomerTypes;
import org.apache.commons.lang3.StringUtils;

public class CompanyCustomer extends ForeignerCompanyCustomer {

    public CompanyCustomer() {
        super(Countries.RUSSIA);
    }

    @Override
    public CustomerTypes getType() {
        return CustomerTypes.COMPANY;
    }

    @Override
    public String toString() {
        return "CompanyCustomer [id=" + getId()
                + ", inn=" + StringUtils.defaultString(getInn())
                + ", shortName=" + StringUtils.defaultString(getShortName())
                + ", longName=" + StringUtils.defaultString(getShortName())
                + "]";
    }
}

