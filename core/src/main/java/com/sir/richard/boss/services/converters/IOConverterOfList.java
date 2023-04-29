package com.sir.richard.boss.services.converters;

import java.util.List;

public interface IOConverterOfList<IN, OUT> {
    List<OUT> convertTo(List<IN> inputList);
}