package com.sir.richard.boss.model.data.conditions;

import com.sir.richard.boss.utils.Pair;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnyConditions {
    private Pair<LocalDate> period;
}
