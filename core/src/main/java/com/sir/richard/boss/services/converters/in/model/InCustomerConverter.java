package com.sir.richard.boss.services.converters.in.model;

import com.sir.richard.boss.bl.entity.*;
import com.sir.richard.boss.bl.jpa.TeAddressRepository;
import com.sir.richard.boss.bl.jpa.TePersonRepository;
import com.sir.richard.boss.bl.jpa.TeWikiAddressTypeRepository;
import com.sir.richard.boss.bl.jpa.TeWikiCustomerTypeRepository;
import com.sir.richard.boss.model.data.AnyCustomer;
import com.sir.richard.boss.model.data.Customer;
import com.sir.richard.boss.model.types.CustomerTypes;
import com.sir.richard.boss.services.converters.IOPersistConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Optional;

@Component
public class InCustomerConverter implements IOPersistConverter<AnyCustomer, TeCustomer> {

    @Autowired
    private TeWikiCustomerTypeRepository wikiCustomerTypeRepository;

    @Autowired
    private TeWikiAddressTypeRepository wikiAddressTypeRepository;

    @Autowired
    private TePersonRepository personRepository;

    @Autowired
    private TeAddressRepository addressRepository;

    @Override
    public TeCustomer saveTo(AnyCustomer inputCustomer, TeCustomer teSourceCustomer) {

        Optional<TeWikiCustomerType> teWikiCustomerType = wikiCustomerTypeRepository.findById(Long.valueOf(inputCustomer.getType().getId()));
        teSourceCustomer.setType(teWikiCustomerType.get());

        if (inputCustomer.getType() == CustomerTypes.CUSTOMER) {

            Customer localCustomer = (Customer) inputCustomer;
            TePerson tePerson;

            if (localCustomer.getPersonId() == null) {
                tePerson = new TePerson();
            } else {
                tePerson = personRepository.findById(localCustomer.getPersonId()).get();
            }
            tePerson.setCountryIsoCode(localCustomer.getAddress().getCountry().getCode());
            tePerson.setFirstName(localCustomer.getFirstName());
            tePerson.setMiddleName(localCustomer.getMiddleName());
            tePerson.setLastName(localCustomer.getLastName());
            tePerson.setEmail(localCustomer.getEmail());
            tePerson.setPhoneNumber(localCustomer.getPhoneNumber());
            teSourceCustomer.setPerson(tePerson);
        }
        TeAddress teAddress;
        if (inputCustomer.getAddress().isNew()) {
            teAddress = new TeAddress();
        } else {
            teAddress = addressRepository.findById(inputCustomer.getAddress().getId()).get();
        }
        Optional<TeWikiAddressType> wikiAddressType = wikiAddressTypeRepository.findById(Long.valueOf(inputCustomer.getAddress().getAddressType().getId()));
        teAddress.setType(wikiAddressType.get());

        teAddress.setAddress(inputCustomer.getAddress().getAddress());
        teAddress.setCountryCode(inputCustomer.getAddress().getCountry().getCode());
        teSourceCustomer.setAddresses(Collections.singleton(teAddress));
        // ...

        return teSourceCustomer;
    }
}
