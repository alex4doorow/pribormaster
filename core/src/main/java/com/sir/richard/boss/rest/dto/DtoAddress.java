package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sir.richard.boss.model.data.CourierInfo;
import com.sir.richard.boss.model.types.AddressTypes;
import com.sir.richard.boss.model.types.Countries;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DtoAddress {
    private Long id;
    private AddressTypes type;
    private Countries country;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String city;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pvz;
    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private CourierInfo courierInfo;

    @JsonIgnore
    public String getViewAddress() {
        if (address != null) {
            final int MAX_VIEW_LENGTH = 25;
            int index = Math.min(address.length(), MAX_VIEW_LENGTH);
            if (index < address.length()) {
                return address.substring(0, index) + "...";
            } else {
                return address.substring(0, index);
            }
        }
        return null;
    }

}
