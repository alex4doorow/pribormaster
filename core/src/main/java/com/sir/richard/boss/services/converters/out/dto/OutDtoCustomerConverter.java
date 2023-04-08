package com.sir.richard.boss.services.converters.out.dto;

import com.sir.richard.boss.model.data.AnyCustomer;
import com.sir.richard.boss.model.data.CompanyCustomer;
import com.sir.richard.boss.model.data.Customer;
import com.sir.richard.boss.model.types.CustomerTypes;
import com.sir.richard.boss.rest.dto.DtoAddress;
import com.sir.richard.boss.rest.dto.DtoCompanyCustomer;
import com.sir.richard.boss.rest.dto.DtoCustomer;
import com.sir.richard.boss.rest.dto.DtoPerson;
import com.sir.richard.boss.services.converters.IOConverter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OutDtoCustomerConverter implements IOConverter<AnyCustomer, DtoCustomer> {

    @Override
    public DtoCustomer convertTo(AnyCustomer customer) {
        DtoCustomer dtoCustomer = new DtoCustomer();

        dtoCustomer.setId(customer.getId());
        dtoCustomer.setType(customer.getType());

        DtoAddress dtoAddress = new DtoAddress();
        dtoAddress.setId(customer.getAddress().getId());
        dtoAddress.setCountry(customer.getAddress().getCountry());
        dtoAddress.setType(customer.getAddress().getAddressType());
        dtoAddress.setAddress(customer.getAddress().getAddress());
        dtoCustomer.setAddress(dtoAddress);

        if (customer.getType() == CustomerTypes.CUSTOMER) {
            Customer localCustomer = (Customer) customer;
            DtoPerson person = new DtoPerson();

            person.setId(localCustomer.getPersonId());
            person.setFirstName(localCustomer.getFirstName());
            person.setMiddleName(localCustomer.getMiddleName());
            person.setLastName(localCustomer.getLastName());
            person.setPhoneNumber(localCustomer.getPhoneNumber());
            person.setEmail(localCustomer.getEmail());
            dtoCustomer.setPerson(person);
        } else if (customer.getType() == CustomerTypes.COMPANY) {
            CompanyCustomer localCustomer = (CompanyCustomer) customer;
            DtoCompanyCustomer company = new DtoCompanyCustomer();

            company.setInn(localCustomer.getInn());
            company.setShortName(localCustomer.getShortName());
            company.setLongName(localCustomer.getLongName());

            List<DtoPerson> dtoContacts = localCustomer.getContacts()
                    .stream()
                    .map(contact -> new DtoPerson(contact.getId(),
                            contact.getFirstName(),
                            contact.getLastName(),
                            contact.getMiddleName(),
                            contact.getPhoneNumber(),
                            contact.getEmail()))
                    .toList();
            company.setContacts(dtoContacts);
            dtoCustomer.setCompany(company);
        }
        return dtoCustomer;
    }
}
