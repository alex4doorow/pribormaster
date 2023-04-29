package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.CrmStatuses;
import com.sir.richard.boss.model.types.CrmTypes;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderExternalCrm extends AnyId {

    private Order parent;
    private CrmTypes type;
    private CrmStatuses status;
    private Long parentId;
    private String parentCode;

    public OrderExternalCrm(CrmTypes type, CrmStatuses status, Long parentId, String parentCode) {
        this();
        this.type = type;
        this.status = status;
        this.parentId = parentId;
        this.parentCode = parentCode;
    }

    public OrderExternalCrm(Order parent) {
        this();
        this.parent = parent;
    }

    @Override
    public OrderExternalCrm clone() throws CloneNotSupportedException  {
        OrderExternalCrm clone = (OrderExternalCrm) super.clone();
        clone.parent = this.parent;
        clone.type = this.type;
        clone.status = this.status;
        clone.parentId = this.parentId;
        clone.parentCode = this.parentCode;
        return clone;
    }
}

