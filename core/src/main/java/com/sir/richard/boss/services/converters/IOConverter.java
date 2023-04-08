package com.sir.richard.boss.services.converters;

public interface IOConverter<IN, OUT> {

    OUT convertTo(IN input);

}
