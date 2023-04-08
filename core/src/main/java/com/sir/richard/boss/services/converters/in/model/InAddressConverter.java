package com.sir.richard.boss.services.converters.in.model;

import com.sir.richard.boss.bl.entity.TeAddress;
import com.sir.richard.boss.bl.entity.TeWikiAddressType;
import com.sir.richard.boss.bl.jpa.TeAddressRepository;
import com.sir.richard.boss.bl.jpa.TeWikiAddressTypeRepository;
import com.sir.richard.boss.model.data.Address;
import com.sir.richard.boss.services.converters.IOPersistConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class InAddressConverter implements IOPersistConverter<Address, TeAddress> {

    @Autowired
    private TeWikiAddressTypeRepository wikiAddressTypeRepository;

    @Autowired
    private TeAddressRepository addressRepository;


    @Override
    public TeAddress saveTo(Address inputAddress, TeAddress teSourceAddress) {
        teSourceAddress.setId(inputAddress.getId());
        if (!inputAddress.isNew()) {
            teSourceAddress = addressRepository.findById(teSourceAddress.getId()).get();
        }
        Optional<TeWikiAddressType> wikiAddressType = wikiAddressTypeRepository.findById(Long.valueOf(inputAddress.getAddressType().getId()));
        teSourceAddress.setType(wikiAddressType.get());
        teSourceAddress.setCountryCode(inputAddress.getCountry().getCode());
        teSourceAddress.setPostCode(inputAddress.getPostCode());
        teSourceAddress.setCity(inputAddress.getCity());
        teSourceAddress.setPvz(inputAddress.getPvz());
        teSourceAddress.setAddress(inputAddress.getAddress());
        teSourceAddress.setAnnotation(inputAddress.getAnnotation());
        return teSourceAddress;
    }
}
