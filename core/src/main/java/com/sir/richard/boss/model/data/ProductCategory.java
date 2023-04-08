package com.sir.richard.boss.model.data;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
public class ProductCategory extends AnyCatalog {

    private Long parentId;
    private String group;

    public ProductCategory(Long id, String name) {
        super(id, name);
    }

    public ProductCategory() {
        super();
    }

    @Override
    public ProductCategory clone() throws CloneNotSupportedException  {
        ProductCategory clone = (ProductCategory) super.clone();
        clone.group = this.group == null ? null : new String(this.group);
        clone.parentId = this.parentId;
        return clone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((group == null) ? 0 : group.hashCode());
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
        ProductCategory other = (ProductCategory) obj;
        if (group == null) {
            if (other.group != null)
                return false;
        } else if (!group.equals(other.group))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ProductCategory [id=" + this.getId() + ", name=" + StringUtils.defaultString(this.getName())
                //+ ", group=" + group
                + "]";
    }

}

