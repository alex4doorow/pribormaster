package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.Countries;
import com.sir.richard.boss.model.types.CustomerTypes;
import com.sir.richard.boss.utils.helpers.CustomerHelper;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

public class ForeignerCustomer extends AnyCustomer implements Person {

    private Long personId;
    @Setter
    private String firstName;
    @Setter
    private String lastName;
    @Setter
    private String middleName;
    @Setter
    private String phoneNumber;
    @Setter
    private String email;

    public ForeignerCustomer(Countries country) {
        super();
        this.setCountry(country);
    }

    public ForeignerCustomer() {
        this(Countries.UNKNOWN);
    }

    @Override
    public Long getPersonId() {
        return personId;
    }

    @Override
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    @Override
    public boolean isPerson() {
        return true;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getMiddleName() {
        return this.middleName;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getViewLongName() {
        String result = StringUtils.defaultString(this.lastName) + " " + StringUtils.defaultString(this.firstName)
                + " " + StringUtils.defaultString(this.middleName);
        return result.trim();
    }

    @Override
    public String getViewLongNameWithContactInfo() {
        return getViewLongName() + ", " + getPhoneNumber();
    }

    @Override
    public String getViewShortName() {
        return CustomerHelper.getCustomerShortName(firstName, middleName, lastName);
    }

    @Override
    public String getViewPhoneNumber() {
        return this.getPhoneNumber();
    }

    @Override
    public CustomerTypes getType() {
        return CustomerTypes.FOREIGNER_CUSTOMER;
    }

    @Override
    public ForeignerCustomer clone() throws CloneNotSupportedException {
        ForeignerCustomer clone = (ForeignerCustomer) super.clone();
        clone.personId = this.personId;
        clone.firstName = this.firstName == null ? null : this.firstName;
        clone.lastName = this.lastName == null ? null : this.lastName;
        clone.middleName = this.middleName == null ? null : this.middleName;
        clone.phoneNumber = this.phoneNumber == null ? null : this.phoneNumber;
        clone.email = this.email == null ? null : this.email;
        return clone;
    }

    @Override
    public String toString() {
        return "ForeignerCustomer {id=" + getId()
                + ", firstName=" + StringUtils.defaultString(getFirstName())
                + ", lastName=" + StringUtils.defaultString(getLastName())
                + ", phoneNumber=" + StringUtils.defaultString(getPhoneNumber())
                + ", email=" + StringUtils.defaultString(getEmail())
                + ", address=" + getAddress()
                + ", country=" + getCountry()
                + "}";
    }
}
