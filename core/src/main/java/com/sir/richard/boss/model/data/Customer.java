package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.Countries;
import com.sir.richard.boss.model.types.CustomerTypes;
import org.apache.commons.lang3.StringUtils;

/**
 * Покупатель - физическое лицо
 * @author alex4doorow
 *
 */
public class Customer extends ForeignerCustomer implements Person {

	public Customer() {
		super(Countries.RUSSIA);
	}
		
	@Override
	public CustomerTypes getType() {
		return CustomerTypes.CUSTOMER;
	}
	
	@Override
	public String toString() {
		return "Customer {id=" + getId() + ", " + getViewShortName() + "}";

		/*
		return "Customer {"
				+ "id=" + getId()
				+ ", firstName=" + StringUtils.defaultString(getFirstName())
				+ ", lastName=" + StringUtils.defaultString(getLastName())
				+ ", phoneNumber=" + StringUtils.defaultString(getPhoneNumber()) 
				+ ", email=" + StringUtils.defaultString(getEmail())
				+ ", address=" + getAddress()
				+ "}";

		 */
	}
}
