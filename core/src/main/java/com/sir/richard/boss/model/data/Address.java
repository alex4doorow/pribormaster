package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.AddressTypes;
import com.sir.richard.boss.model.types.Countries;
import com.sir.richard.boss.utils.TextUtils;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.math.NumberUtils;

@Setter
@Getter
public class Address extends AnyId {

    private AddressTypes addressType;
    private Countries country;
    private CarrierInfo carrierInfo;
    private String address;
    private String annotation;

    public Address(Countries country, AddressTypes addressTypes) {
        super();
        this.country = country;
        this.addressType = addressTypes;
        this.carrierInfo = new CarrierInfo();
    }

    public Address() {
        this(Countries.RUSSIA, AddressTypes.MAIN);
    }

    public String getCity() {
        return TextUtils.cutCityFromAddress(this.address);
    }

    public String getStreetAddress() {
        return TextUtils.cutStreetFromAddress(this.address);
    }

    public String getPvz() {
        return carrierInfo.getPvz();
    }

    public String getPostCode() {
        if (this.address == null || this.country != Countries.RUSSIA) {
            return "000000";
        }
        String postCode = this.address.trim();
        if (postCode.length() >= 6) {
            postCode = postCode.substring(0, 6);
        } else {
            postCode = "";
        }
        return (NumberUtils.isCreatable(postCode)) ? postCode : "";
    }

    public String getPostAddressText() {
        if (this.address == null || this.country != Countries.RUSSIA) {
            return "";
        }
        String text = this.address.trim();
        if (text.length() >= 7) {
            text = text.substring(7, text.length()).replace(" →", ",");
        } else {
            text = this.address;
        }
        return text;
    }

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


    @Override
    public Address clone() throws CloneNotSupportedException {
        Address clone = (Address) super.clone();
        clone.addressType = this.addressType;
        clone.country = this.country;
        clone.carrierInfo = this.carrierInfo == null ? null : carrierInfo.clone();
        clone.address = this.address == null ? null : new String(this.address);
        clone.annotation = this.annotation == null ? null : new String(this.annotation);
        return clone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((addressType == null) ? 0 : addressType.hashCode());
        result = prime * result + ((annotation == null) ? 0 : annotation.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (addressType != other.addressType)
            return false;
        if (annotation == null) {
            if (other.annotation != null)
                return false;
        } else if (!annotation.equals(other.annotation))
            return false;

        if (country != other.country)
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "Address {id=" + getId() + ", " + address + "}";
        /*
        return "Address {id=" + getId() + ", addressType=" + addressType + ", country=" + country + ", address="
                + address + ", cdekInfo=" + carrierInfo + "}";

         */
    }
}

