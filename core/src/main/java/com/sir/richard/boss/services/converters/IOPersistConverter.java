package com.sir.richard.boss.services.converters;

public interface IOPersistConverter <IN, OUT> {

    OUT saveTo(IN input, OUT output);
}
