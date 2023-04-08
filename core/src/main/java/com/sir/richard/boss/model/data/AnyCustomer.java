package com.sir.richard.boss.model.data;


import com.sir.richard.boss.model.types.Countries;
import com.sir.richard.boss.model.types.CustomerTypes;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public abstract class AnyCustomer extends AnyId {
	
	@Setter
	@Getter
	private Address address = new Address();

	public Countries getCountry() {
		if (address == null) {
			return null;
		}
		return address.getCountry();
	}

	public void setCountry(Countries country) {
		if (address != null) {
			address.setCountry(country);
		}
	}

	public AnyCustomer() {
		super();
	}
	
	public boolean isPerson() {
		return false;
	}
	
	public boolean isCompany() {
		return !isPerson();
	}

	public CustomerTypes getType() {
		return CustomerTypes.UNKNOWN;
	}

	public abstract String getViewLongName();
	public abstract String getViewLongNameWithContactInfo();
	public abstract String getViewShortName();
	public abstract String getViewPhoneNumber();
	
	public abstract String getEmail();
	
	public abstract Long getPersonId();
	public abstract void setPersonId(Long value);

	@Override
	public AnyCustomer clone() throws CloneNotSupportedException  {
		AnyCustomer clone = (AnyCustomer) super.clone();
		clone.address = this.address == null ? null : this.address;
		return clone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), address);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		AnyCustomer that = (AnyCustomer) o;
		return Objects.equals(address, that.address);
	}

	/*
	protected AnyCustomer deepCopy(AnyCustomer inCustomer) {
		inCustomer.setId(this.getId());

		return inCustomer;
	}

	*/

	@Override
	public String toString() {
		return "AnyCustomer [address=" + address + "]";
	}
	
}
