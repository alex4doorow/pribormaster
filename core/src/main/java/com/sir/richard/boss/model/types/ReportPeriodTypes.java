package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
public enum ReportPeriodTypes {
		
	CURRENT_MONTH(1, "текущий месяц", "месяц"),
	CURRENT_QUARTER(2, "текущий квартал", "квартал"),
	CURRENT_HALF_YEAR(105, "текущее полугодие", "полугодие"),
	CURRENT_YEAR(3, "текущий год", "год"),	
	
	ANY_MONTH(4, "произвольный месяц", "месяц"),
	ANY_QUARTER(102, "произвольный квартал", "квартал"),
	ANY_HALF_YEAR(103, "произвольное полугодие", "полугодие"),
	ANY_YEAR(104, "произвольный год", "год"),	
	ANY_PERIOD(5, "произвольный период", ""),
	
	PRIOR_MONTH(6, "предыдущий месяц", ""),
	LAST_7_DAYS(11, "последние 7 дней", ""),
	LAST_30_DAYS(12, "последние 30 дней", ""),
	LAST_90_DAYS(13, "последние 90 дней", "");
		
	private final int id;
	private final String annotation;
	private final String text;

	public static ReportPeriodTypes[] getListOrderValues() {
		Set<ReportPeriodTypes> result = new HashSet<ReportPeriodTypes>();
		
		result.add(ReportPeriodTypes.CURRENT_MONTH);
		result.add(ReportPeriodTypes.CURRENT_QUARTER);
		result.add(ReportPeriodTypes.CURRENT_HALF_YEAR);
		result.add(ReportPeriodTypes.CURRENT_YEAR);
		result.add(ReportPeriodTypes.ANY_MONTH);
		result.add(ReportPeriodTypes.ANY_PERIOD);
		result.add(ReportPeriodTypes.PRIOR_MONTH);
		result.add(ReportPeriodTypes.LAST_7_DAYS);
		result.add(ReportPeriodTypes.LAST_30_DAYS);		
		result.add(ReportPeriodTypes.LAST_90_DAYS);
		return result.toArray(new ReportPeriodTypes[result.size()]);
	}
	
	public static ReportPeriodTypes[] getReportValues() {
		Set<ReportPeriodTypes> result = new HashSet<ReportPeriodTypes>();
		
		result.add(ReportPeriodTypes.ANY_MONTH);
		result.add(ReportPeriodTypes.ANY_QUARTER);
		result.add(ReportPeriodTypes.ANY_HALF_YEAR);
		result.add(ReportPeriodTypes.ANY_YEAR);
		return result.toArray(new ReportPeriodTypes[result.size()]);
	}
	
	public static ReportPeriodTypes getValueById(int value) {
		if (value == 1) {
			return ReportPeriodTypes.CURRENT_MONTH;
		} else if (value == 2) {
			return ReportPeriodTypes.CURRENT_QUARTER;
		} else if (value == 105) {
			return ReportPeriodTypes.CURRENT_HALF_YEAR;
		} else if (value == 3) {
			return ReportPeriodTypes.CURRENT_YEAR;
		} else if (value == 4) {
			return ReportPeriodTypes.ANY_MONTH;
		} else if (value == 102) {
			return ReportPeriodTypes.ANY_QUARTER;
		} else if (value == 103) {
			return ReportPeriodTypes.ANY_HALF_YEAR;
		} else if (value == 104) {
			return ReportPeriodTypes.ANY_YEAR;
		} else if (value == 5) {
			return ReportPeriodTypes.ANY_PERIOD;
		} else if (value == 6) {
			return ReportPeriodTypes.PRIOR_MONTH;
		} else if (value == 11) {
			return ReportPeriodTypes.LAST_7_DAYS;
		} else if (value == 12) {
			return ReportPeriodTypes.LAST_30_DAYS;
		} else if (value == 13) {
			return ReportPeriodTypes.LAST_90_DAYS;
		}  else {
			return ReportPeriodTypes.ANY_PERIOD;
		}	
}
	
	public static ReportPeriodTypes getValueByCode(String inputValue) {
		if (StringUtils.isEmpty(inputValue)) {
			return ReportPeriodTypes.ANY_PERIOD; 
		} 
		String value = inputValue.trim().toLowerCase();
		if (value.equals("current-month")) {
			return ReportPeriodTypes.CURRENT_MONTH;
		} else if (value.equals("prior-month")) {
			return ReportPeriodTypes.PRIOR_MONTH;
		} else if (value.equals("current-quarter")) {
			return ReportPeriodTypes.CURRENT_QUARTER;
		} else if (value.equals("current-year")) {
			return ReportPeriodTypes.CURRENT_YEAR;
		} else if (value.equals("any-month")) {
			return ReportPeriodTypes.ANY_MONTH;
		} else if (value.equals("any-period")) {
			return ReportPeriodTypes.ANY_PERIOD;
		} else if (value.equals("last-7-days")) {
			return ReportPeriodTypes.LAST_7_DAYS;
		} else if (value.equals("last-30-days")) {
			return ReportPeriodTypes.LAST_30_DAYS;
		} else if (value.equals("last-90-days")) {
			return ReportPeriodTypes.LAST_90_DAYS;
		}  else {
			return ReportPeriodTypes.ANY_PERIOD;
		}
	}

}
