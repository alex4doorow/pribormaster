package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.Countries;

public interface Person {

    Long getPersonId();
    Countries getCountry();
    String getFirstName();
    String getLastName();
    String getMiddleName();
    String getPhoneNumber();
    String getEmail();
    String getViewLongName();

}