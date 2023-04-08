package com.sir.richard.boss.services.converters.out.model;

import com.sir.richard.boss.bl.entity.TeAddress;
import com.sir.richard.boss.model.data.Address;
import com.sir.richard.boss.model.types.AddressTypes;
import com.sir.richard.boss.model.types.Countries;
import com.sir.richard.boss.services.converters.IOConverter;
import org.springframework.stereotype.Component;

@Component
public class OutAddressConverter implements IOConverter<TeAddress, Address> {

    @Override
    public Address convertTo(TeAddress teAddress) {

        Address address = new Address(Countries.getValueByCode(teAddress.getCountryCode()),
                AddressTypes.getValueById(teAddress.getType().getId()));
        address.setId(teAddress.getId());
        address.setAddress(teAddress.getAddress());
        if (teAddress.getCity() != null) {
            address.getCarrierInfo().setCityContext(teAddress.getCity());
        }
        if (teAddress.getPvz() != null) {
            address.getCarrierInfo().setPvz(teAddress.getPvz());
        }
        return address;
    }
}
