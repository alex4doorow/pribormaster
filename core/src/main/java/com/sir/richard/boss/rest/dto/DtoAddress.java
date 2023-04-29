package com.sir.richard.boss.rest.dto;

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

}
