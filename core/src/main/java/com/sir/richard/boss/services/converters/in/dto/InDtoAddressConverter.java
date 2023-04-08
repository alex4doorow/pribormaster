package com.sir.richard.boss.services.converters.in.dto;

import com.sir.richard.boss.model.data.Address;
import com.sir.richard.boss.model.data.AnyCustomer;
import com.sir.richard.boss.model.types.AddressTypes;
import com.sir.richard.boss.model.types.Countries;
import com.sir.richard.boss.rest.dto.DtoAddress;
import com.sir.richard.boss.rest.dto.DtoCustomer;
import com.sir.richard.boss.services.converters.IOConverter;
import org.springframework.stereotype.Component;

@Component
public class InDtoAddressConverter implements IOConverter<DtoAddress, Address> {

    @Override
    public Address convertTo(DtoAddress dtoAddress) {
        Address address = new Address(dtoAddress.getCountry(), dtoAddress.getType());
        address.setId(dtoAddress.getId());
        address.setCountry(dtoAddress.getCountry());
        address.setAddress(dtoAddress.getAddress());
        address.getCarrierInfo().setCityContext(dtoAddress.getCity());
        address.getCarrierInfo().setPvz(dtoAddress.getPvz());
        return address;
    }
}
