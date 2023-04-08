package com.sir.richard.boss.model.data;


import com.sir.richard.boss.model.types.CustomerTypes;

public class BusinessmanCustomer extends CompanyCustomer {
		
	public BusinessmanCustomer() {
		super();		
	}	
		
	@Override
	public CustomerTypes getType() {
		return CustomerTypes.BUSINESSMAN;
	}

}
