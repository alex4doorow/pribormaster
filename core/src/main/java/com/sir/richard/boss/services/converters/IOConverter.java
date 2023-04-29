package com.sir.richard.boss.services.converters;

import java.util.List;

public interface IOConverter<IN, OUT> {
    OUT convertTo(IN input);
}
