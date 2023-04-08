package com.sir.richard.boss.model.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public abstract class AnyId implements Cloneable {

    private Long id;

    public AnyId() {
        super();
        clear();
    }

    public AnyId(Long id) {
        this();
        this.id = id;
    }

    public boolean isNew() {
        return (this.id == null || this.id == 0);
    }

    @Override
    public AnyId clone() throws CloneNotSupportedException  {
        AnyId clone = (AnyId) super.clone();
        clone.id = this.id;
        return clone;
    }

    protected void clear() {
        this.id = null;
    }

    @Override
    public String toString() {
        return "AnyId {id=" + id + "}";
    }

}
