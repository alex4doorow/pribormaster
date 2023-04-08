package com.sir.richard.boss.model.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AnyCatalog extends AnyId {

    private String name;
    private String seoKey;
    private String seoUrl;

    public AnyCatalog(Long id, String name) {
        super(id);
        this.name = name;
    }

    public AnyCatalog() {
        this(0L, "");
    }


    @Override
    public AnyCatalog clone() throws CloneNotSupportedException  {
        AnyCatalog clone = (AnyCatalog) super.clone();
        clone.name = this.name == null ? null : new String(this.name);
        return clone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        AnyCatalog other = (AnyCatalog) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AnyCatalog [id=" + getId() +", name=" + name + "]";
    }

}
