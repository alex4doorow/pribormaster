package com.sir.richard.boss.model.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class CarrierInfo implements Cloneable {

    private String region;
    private String cityContext;
    private String shortAddress;
    private String fullAddress;

    private int pvzId;
    private int cityId;
    private String pvz;
    private String street;
    private String house;
    private String flat;

    private Long deliveryVariantId;

    // add info pvz
    private String workTime;
    private String addressComment;
    private String phone;
    private String email;
    private String note;
    private String pvzType;
    private String ownerCode;
    private String haveCash;
    private String allowedCod;
    private String nearestStation;
    private String metroStation;
    private String url;
    private String weightMax;
    private BigDecimal coordX;
    private BigDecimal coordY;
    private List<String> postalCodes = new ArrayList<>();
    private CourierInfo courierInfo;

    public Integer getPostalSize() {
        if (postalCodes == null) {
            return 0;
        }
        return postalCodes.size();
    }

    @Override
    public CarrierInfo clone() throws CloneNotSupportedException  {
        CarrierInfo clone = (CarrierInfo) super.clone();
        clone.region = this.region == null ? null : this.region;
        clone.cityContext = this.cityContext == null ? null : this.cityContext;
        clone.shortAddress = this.shortAddress == null ? null : this.shortAddress;
        clone.fullAddress = this.fullAddress == null ? null : this.fullAddress;
        clone.cityId = this.cityId;
        clone.pvz = this.pvz == null ? null : this.pvz;
        clone.street = this.street == null ? null : this.street;
        clone.house = this.house == null ? null : this.house;
        clone.flat = this.flat == null ? null : this.flat;
        //clone.courierInfo = this.courierInfo == null ? null : courierInfo.clone();
        return clone;
    }
}


