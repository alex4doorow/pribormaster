package com.sir.richard.boss.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberUtils {
	
	public static String NUMBER_FORMAT_MONEY = "#,##0.00";

	public static String formatNumber(BigDecimal value, String pattern) {
		DecimalFormat df = new DecimalFormat(pattern);
		return df.format(value);
	}
		
	public static String defaultFormatNumber(BigDecimal value) {
		return formatNumber(value, NUMBER_FORMAT_MONEY);
	}
	
	public static String formatRate(BigDecimal value) {
		if (value == null || value.compareTo(BigDecimal.ZERO) == 0) {
			return "";
		}
		return formatNumber(value, "##0.00") + "%";
	}	
	
	public static String localeFormatNumber(BigDecimal value, Locale locale, char decimalSeparator, char groupingSeparator, String pattern) {
	
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator(decimalSeparator);
		symbols.setGroupingSeparator(groupingSeparator);
		
		DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
		return decimalFormat.format(value);
	}
	
	public static String localeFormatNumber(BigDecimal value, Locale locale, char decimalSeparator, String pattern) {
		
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator(decimalSeparator);
		
		DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
		return decimalFormat.format(value);
	}
			
	public static String formatRoubles(BigDecimal value) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("ru", "RU"));
		return formatter.format(value);// + "\u20BD";
	}
}
