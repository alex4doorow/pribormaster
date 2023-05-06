package com.sir.richard.boss.services.converters;

import java.util.Collection;
import java.util.List;

public interface IOConverterOfList<IN, OUT> {
    Collection<OUT> convertTo(Collection<IN> inputList);
}