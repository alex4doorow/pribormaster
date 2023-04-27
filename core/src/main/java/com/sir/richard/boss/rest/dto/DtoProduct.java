package com.sir.richard.boss.rest.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@Data
@NoArgsConstructor
public class DtoProduct {
    private Long id;
    private String name;
    private String sku;

    //[ANTIDOG-UPAKOVKA-SVETOSHUM] Упаковка со сменными светозвуковыми картриджами PYRODEFENDER (3 шт)

    public String getViewSKU() {
        String result = "";
        if (StringUtils.isEmpty(this.sku)) {
            result = StringUtils.truncate(this.name.trim(), 3);
        } else {
            result = this.sku;
        }
        return StringUtils.upperCase(result);
    }

    public String getViewName() {
        final int MAX_VIEW_LENGTH = 139;
        String result = "";
        if (StringUtils.isNotEmpty(this.sku)) {
            result = "[" + StringUtils.upperCase(this.sku) + "] " + this.getName();
        } else {
            result = this.getName();
        }
        int index = Math.min(result.length(), MAX_VIEW_LENGTH);
        if (index < result.length()) {
            return result.substring(0, index) + "...";
        } else {
            return result.substring(0, index);
        }
    }
}
