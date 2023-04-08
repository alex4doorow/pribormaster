package com.sir.richard.boss.utils;

import java.math.BigDecimal;

public class MathUtils {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static BigDecimal weightG2Kg(int weightG) {
		return BigDecimal.valueOf(0.001).multiply(BigDecimal.valueOf(weightG));
	}
}
