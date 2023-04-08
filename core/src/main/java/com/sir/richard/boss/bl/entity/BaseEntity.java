package com.sir.richard.boss.bl.entity;

public interface BaseEntity<ID> {
    void setId(ID id);
    ID getId();
}
