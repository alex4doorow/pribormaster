package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.Countries;
import com.sir.richard.boss.model.types.CustomerTypes;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ForeignerCompanyCustomer extends AnyCustomer {
		
	private String inn;	
	private String shortName;
	private String longName;
	
	private List<Contact> contacts;
	
	public ForeignerCompanyCustomer(Countries country) {
		super();
		this.setCountry(country);
		contacts = new ArrayList<>();
	}
	
	public ForeignerCompanyCustomer() {
		this(Countries.UNKNOWN);
	}
	
	@Override
	public Long getPersonId() {
		return 0L;
	}
	
	@Override
	public void setPersonId(Long value) {}

	public String getShortName() {		
		return StringUtils.isEmpty(shortName) ? shortName : shortName.toUpperCase();
	}

	public String getLongName() {
		return StringUtils.isEmpty(longName) ? longName : longName.toUpperCase();
	}

	@Override
	public String getEmail() {
		return getMainContact().getEmail();
	}
	
	@Override
	public String getViewLongName() {
		String viewLongName = StringUtils.isNotEmpty(this.longName) ? longName : this.shortName;		
		viewLongName = viewLongName.trim();
		if (StringUtils.isEmpty(this.inn)) {
			return viewLongName;
		} else {
			return "ИНН " + this.inn + " " + StringUtils.defaultString(viewLongName);
		}
	}
	
	@Override
	public String getViewLongNameWithContactInfo() {
		String viewLongName = getViewLongName();
		String contact = getMainContact().getViewLongName() + " " + getMainContact().getEmail();
		return viewLongName.trim() + ", " + contact;
	}
	
	@Override
	public String getViewShortName() {
		return this.shortName;
	}
	
	@Override
	public String getViewPhoneNumber() {
		return getMainContact().getPhoneNumber();
	}	
	
	public Contact getMainContact() {		
		return contacts.get(0);
	}
	
	public void setMainContact(Contact contact) {
		contacts.remove(0);
		contacts.add(contact);
	}

	@Override
	public CustomerTypes getType() {
		return CustomerTypes.FOREIGNER_COMPANY;
	}

	@Override
	public ForeignerCompanyCustomer clone() throws CloneNotSupportedException  {
		ForeignerCompanyCustomer clone = (ForeignerCompanyCustomer) super.clone();		
		clone.inn = this.inn == null ? null : this.inn;
		clone.shortName = this.shortName == null ? null : this.shortName;
		clone.longName = this.longName == null ? null : this.longName;
		clone.contacts = this.contacts == null ? null : new ArrayList<>(this.contacts);
		return clone;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((contacts == null) ? 0 : contacts.hashCode());
		
		result = prime * result + ((inn == null) ? 0 : inn.hashCode());
		result = prime * result + ((longName == null) ? 0 : longName.hashCode());
		result = prime * result + ((shortName == null) ? 0 : shortName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ForeignerCompanyCustomer other = (ForeignerCompanyCustomer) obj;
		if (contacts == null) {
			if (other.contacts != null)
				return false;
		} else if (!contacts.equals(other.contacts))
			return false;
		if (inn == null) {
			if (other.inn != null)
				return false;
		} else if (!inn.equals(other.inn))
			return false;
		if (longName == null) {
			if (other.longName != null)
				return false;
		} else if (!longName.equals(other.longName))
			return false;
		if (shortName == null) {
			return other.shortName == null;
		} else return shortName.equals(other.shortName);
	}

	@Override
	public String toString() {
		return "ForeignerCompanyCustomer [id=" + getId() 
				+ "inn=" + StringUtils.defaultString(getInn()) 
				+ ", shortName=" + StringUtils.defaultString(getShortName()) 
				+ ", longName=" + StringUtils.defaultString(getShortName()) 
				+ "]";
	}
}
