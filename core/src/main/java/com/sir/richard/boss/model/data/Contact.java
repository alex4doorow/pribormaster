package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.Countries;
import org.apache.commons.lang3.StringUtils;

public class Contact extends AnyId implements Person {

    private Long personId;
    private Countries country;
    private String phoneNumber;
    private String email;

    private String firstName;
    private String lastName;
    private String middleName;

    public Contact(Countries country) {
        super();
        this.country = country;
    }

    public Contact() {
        this(Countries.RUSSIA);
    }

    @Override
    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    @Override
    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getViewLongName() {
        String result = StringUtils.defaultString(this.lastName) + " " + StringUtils.defaultString(this.firstName) + " " + StringUtils.defaultString(this.middleName);
        return result.trim();
    }

    @Override
    public Contact clone() throws CloneNotSupportedException  {
        Contact clone = (Contact) super.clone();
        clone.personId = this.personId;
        clone.country = this.country;
        clone.phoneNumber = this.phoneNumber == null ? null : new String(this.phoneNumber);
        clone.email = this.email == null ? null : new String(this.email);
        clone.firstName = this.firstName == null ? null : new String(this.firstName);
        clone.lastName = this.lastName == null ? null : new String(this.lastName);
        clone.middleName = this.middleName == null ? null : new String(this.middleName);
        return clone;
    }
}

