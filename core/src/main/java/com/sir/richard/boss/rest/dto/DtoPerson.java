package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoPerson {
    private Long id;
    private String firstName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String middleName;

    private String phoneNumber;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;

    @JsonIgnore
    public String getShortName() {
        if (StringUtils.isNotEmpty(this.firstName) && StringUtils.isEmpty(this.lastName)) {
            return this.firstName.trim();
        }
        if (StringUtils.isEmpty(this.firstName) && StringUtils.isNotEmpty(this.lastName)) {
            return this.lastName.trim();
        }
        if (StringUtils.isNotEmpty(this.firstName) && StringUtils.isNotEmpty(this.lastName) && StringUtils.isEmpty(this.middleName)) {
            return (this.lastName + " " + this.firstName).trim();
        }
        String ln = "", fn = "", mn = "";
        if (!StringUtils.isEmpty(this.lastName)) {
            ln = this.lastName.trim();
        }
        if (!StringUtils.isEmpty(this.firstName)) {
            fn = this.firstName.trim().charAt(0) + ".";
        }
        if (!StringUtils.isEmpty(this.middleName)) {
            mn = this.middleName.trim().charAt(0) + ".";
        }
        return (ln + " " + fn + " " + mn).trim();
    }

    @JsonIgnore
    public String getViewLongName() {
        String result = StringUtils.defaultString(this.lastName) + " " + StringUtils.defaultString(this.firstName)
                + " " + StringUtils.defaultString(this.middleName);
        return result.trim();
    }

    @JsonIgnore
    public static DtoPerson createEmpty() {
        return new DtoPerson();
    }

    @JsonIgnore
    @Override
    public String toString() {
        return "DtoPerson {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
