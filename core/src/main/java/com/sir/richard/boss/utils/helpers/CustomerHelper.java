package com.sir.richard.boss.utils.helpers;

import org.apache.commons.lang3.StringUtils;

public class CustomerHelper {

    public static String getCustomerShortName(String firstName, String middleName, String lastName) {
        if (StringUtils.isNotEmpty(firstName) && StringUtils.isEmpty(lastName)) {
            return firstName.trim();
        }
        if (StringUtils.isEmpty(firstName) && StringUtils.isNotEmpty(lastName)) {
            return lastName.trim();
        }
        if (StringUtils.isNotEmpty(firstName) && StringUtils.isNotEmpty(lastName) && StringUtils.isEmpty(middleName)) {
            return (lastName + " " + firstName).trim();
        }
        String ln = "", fn = "", mn = "";
        if (!StringUtils.isEmpty(lastName)) {
            ln = lastName.trim();
        }
        if (!StringUtils.isEmpty(firstName)) {
            fn = firstName.trim().charAt(0) + ".";
        }
        if (!StringUtils.isEmpty(middleName)) {
            mn = middleName.trim().charAt(0) + ".";
        }
        return (ln + " " + fn + " " + mn).trim();
    }
}
