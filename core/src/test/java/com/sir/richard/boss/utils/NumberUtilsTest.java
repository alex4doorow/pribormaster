package com.sir.richard.boss.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

@Slf4j
public class NumberUtilsTest {

    @Test
    public void testNumberFormat() {
        String s;
        s = NumberUtils.defaultFormatNumber(new BigDecimal("123456.78"));
        log.info(s);
        s = NumberUtils.defaultFormatNumber(new BigDecimal("6.78"));
        log.info(s);
        s = NumberUtils.defaultFormatNumber(new BigDecimal("6"));
        log.info(s);
    }
}
