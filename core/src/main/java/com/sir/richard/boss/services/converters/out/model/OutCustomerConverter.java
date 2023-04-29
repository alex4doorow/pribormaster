package com.sir.richard.boss.services.converters.out.model;

import com.sir.richard.boss.bl.entity.TeAddress;
import com.sir.richard.boss.bl.entity.TeCustomer;
import com.sir.richard.boss.bl.entity.TeCustomerCompany;
import com.sir.richard.boss.bl.entity.TePerson;
import com.sir.richard.boss.bl.jpa.TeCustomerRepository;
import com.sir.richard.boss.model.data.*;
import com.sir.richard.boss.model.types.AddressTypes;
import com.sir.richard.boss.model.types.Countries;
import com.sir.richard.boss.model.types.CustomerTypes;
import com.sir.richard.boss.services.converters.IOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class OutCustomerConverter implements IOConverter<TeCustomer, AnyCustomer> {

    @Autowired
    private TeCustomerRepository customerRepository;
    @Autowired
    private OutAddressConverter addressConverter;

    @Override
    public AnyCustomer convertTo(TeCustomer teCustomer) {

        Address customerAddress = new Address();
        for (TeAddress teAddress : teCustomer.getAddresses()) {
            customerAddress = addressConverter.convertTo(teAddress);
            break;
        }

        AnyCustomer customer;
        if (teCustomer.getType().getId() == CustomerTypes.CUSTOMER.getId()) {

            Customer localCustomer = new Customer();
            localCustomer.setId(teCustomer.getId());
            localCustomer.setPersonId(teCustomer.getPerson().getId());
            localCustomer.setFirstName(teCustomer.getPerson().getFirstName());
            localCustomer.setMiddleName(teCustomer.getPerson().getMiddleName());
            localCustomer.setLastName(teCustomer.getPerson().getLastName());
            localCustomer.setPhoneNumber(teCustomer.getPerson().getPhoneNumber());
            localCustomer.setEmail(teCustomer.getPerson().getEmail());
            customer = localCustomer;

        } else if (teCustomer.getType().getId() == CustomerTypes.COMPANY.getId()) {
            TeCustomerCompany teCustomerCompany = customerRepository.findCustomerCompanyByCustomerId(teCustomer.getId());

            CompanyCustomer localCustomer = new CompanyCustomer();
            localCustomer.setInn(teCustomerCompany.getInn());
            localCustomer.setShortName(teCustomerCompany.getShortName());
            localCustomer.setLongName(teCustomerCompany.getLongName());

            if (teCustomer.getContacts() != null) {
                for (TePerson teContact : teCustomer.getContacts()) {
                    Contact contact = new Contact(customerAddress.getCountry());
                    contact.setId(teContact.getId());
                    contact.setFirstName(teContact.getFirstName());
                    contact.setLastName(teContact.getLastName());
                    contact.setMiddleName(teContact.getMiddleName());
                    contact.setEmail(teContact.getEmail());
                    contact.setPhoneNumber(teContact.getPhoneNumber());
                    localCustomer.getContacts().add(contact);
                }
            }
            customer = localCustomer;
        } else {
            return null;
        }

        customer.setId(teCustomer.getId());
        customer.setAddress(customerAddress);

        return customer;
    }
}
