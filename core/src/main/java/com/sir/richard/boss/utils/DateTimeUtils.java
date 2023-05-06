package com.sir.richard.boss.utils;

import org.apache.commons.lang3.StringUtils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.*;

/**
 * Набор утилитных методов для преобразования даты в строки и обратно
 * @author alex4doorow
 *
 */
public class DateTimeUtils {
		
	public static final String DATE_FORMAT_dd_MM_yyyy = "dd.MM.yyyy";
	public static final String DATE_FORMAT_HH_mm = "HH:mm";
	public static final String DATE_FORMAT_HH_mm_EEE = "dd.MM.yyyy, EEE";
	public static final String DATE_FORMAT_UTC = "dd.MM.yyyy HH:mm:ss";
	public static final String DATE_FORMAT_UTC_SSS = "yyyy-MM-dd HH:mm:ss.SSS";
	public static final String DATE_FORMAT_UTC_2 = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_FORMAT_UTC_SSS_Z = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	public static final String DATE_FORMAT_OZON = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	public static final String DATE_FORMAT_CDEK = "yyyy-MM-dd'T'HH:mm:ssZ"; // "2022-11-21T09:05:06+0000"
	public static final String DATE_FORMAT_yyyy_MM_dd = "yyyy-MM-dd";

	public static Date convertToDate(LocalDate dateToConvert) {
		return java.util.Date.from(dateToConvert.atStartOfDay()
				.atZone(ZoneId.systemDefault())
				.toInstant());
	}

	public static String defaultFormatDateTimeByTimeZone(Date date, String timeZoneId) {		
		final SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_UTC_SSS_Z);
		sdf.setTimeZone(TimeZone.getTimeZone(timeZoneId));
		return sdf.format(date);
	}
	
	public static String defaultFormatTimeByTimeZone(Date date, String timeZoneId) {		
		final SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_HH_mm);
		sdf.setTimeZone(TimeZone.getTimeZone(timeZoneId));
		return sdf.format(date);
	}

	public static String formatDate(Date date, String dateFormatString) {
		if (date == null) {
			return "";			
		}				
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(dateFormatString);
			String format = formatter.format(date);
			return format;
		} catch (Exception ex) {
			return "error: [date=" + date + ", dateFormatString=" + dateFormatString + "]";
		}		
	}

	public static String formatLocalDate(LocalDate localDate, String dateFormatString) {
		return localDate.format(DateTimeFormatter.ofPattern(dateFormatString));
	}

	public static String formatLocalDateTime(LocalDateTime date, String dateFormatString) {
		if (date == null) {
			return "";
		}
		return date.format(DateTimeFormatter.ofPattern(dateFormatString));
	}
	
	public static String defaultFormatDate(Date date) {
		return formatDate(date, DATE_FORMAT_dd_MM_yyyy);
	}

	public static String defaultFormatLocalDate(LocalDate localDate) {
		return formatLocalDate(localDate, DATE_FORMAT_dd_MM_yyyy);
	}
	
	public static String defaultFormatTime(Date date) {
		return formatDate(date, DATE_FORMAT_HH_mm);
	}

	public static int dateToShortYear(Date date) {		
		if (date == null) {
			return 0;
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yy");
		String format = formatter.format(date);
		return Integer.parseInt(format);
	}

	public static int dateToLongYear(Date date) {		
		if (date == null) {
			return 0;
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		String format = formatter.format(date);
		return Integer.parseInt(format);
	}
	
	public static Date stringToDate(String inputString, String dateFormatString) throws ParseException {
		if (StringUtils.isEmpty(inputString)) {
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormatString);		
		return formatter.parse(inputString);	
	}

	public static LocalDateTime stringToLocalDateTime(String inputString, String dateFormatString) throws ParseException {
		if (StringUtils.isEmpty(inputString)) {
			return null;
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormatString);
		return LocalDateTime.parse(inputString, formatter);
	}

	public static LocalDate stringToLocalDate(String inputString, String dateFormatString) throws ParseException {
		if (StringUtils.isEmpty(inputString)) {
			return null;
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormatString);
		return LocalDate.parse(inputString, formatter);
	}
	
	public static Date defaultFormatStringToDate(String inputString) throws ParseException {
		return stringToDate(inputString, DATE_FORMAT_dd_MM_yyyy);
	}

	public static LocalDate defaultFormatStringToLocalDate(String inputString) throws ParseException {
		return stringToLocalDate(inputString, DATE_FORMAT_dd_MM_yyyy);
	}
	
	public static Date timestampToDate(Timestamp inputTimestamp) {
		
		Date modifiedDateTime;
    	Timestamp modifiedTimestamp = inputTimestamp;
    	if (modifiedTimestamp != null) {
    		modifiedDateTime = new Date(modifiedTimestamp.getTime());
    	} else {
    		modifiedDateTime = null;
    	}
    	return modifiedDateTime;		
	}
	
	public static Timestamp dateToTimestamp(Date inputDate) {
		if (inputDate == null) {
			return null;
		}		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inputDate);
		cal.set(Calendar.MILLISECOND, 0);		
		return new Timestamp(cal.getTimeInMillis());
	}
	
	public static Date truncateDate(Date inputDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);		
	    return calendar.getTime();
	}
	
	public static Date beforeAnyDate(Date inputDate, int incrementDay) {
		return afterAnyDate(inputDate, -incrementDay);
	}
	
	public static Date afterAnyDate(Date inputDate, int incrementDay) {
		Calendar calendar = Calendar.getInstance();		
		calendar.setTime(inputDate);
		calendar.add(Calendar.DAY_OF_YEAR, incrementDay);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);		
	    return calendar.getTime();
	}
	
	public static Date afterAnyDateOnlyWork(Date inputDate, int incrementDay) {
		
		Date result = inputDate;
		
		int i = 0;
		
		while (i < incrementDay) {
			result = afterAnyDate(result, 1);
			int dayOfWeek = Integer.valueOf(formatDate(result, "u"));
			if (dayOfWeek == 6 || dayOfWeek == 7) {
				continue;
			}
			i++;			
		}
	    return result;
	}
	
	public static Date beforeDate(Date inputDate) {
		
		Calendar calendar = Calendar.getInstance();		
		calendar.setTime(inputDate);
		calendar.add(Calendar.DAY_OF_YEAR, -1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);		
	    return calendar.getTime();
	}
	
	public static Date firstDayOfMonth(Date inputDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);		
	    calendar.set(Calendar.DAY_OF_MONTH, 1);
	    return calendar.getTime();
	}
	
	public static Date lastDayOfMonth(Date inputDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		calendar.add(Calendar.MONTH, 1);
	    calendar.add(Calendar.DAY_OF_MONTH, -1);
	    return calendar.getTime();
	}
	
	public static Date firstDayOfQuarter(Date inputDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		int month = calendar.get(Calendar.MONTH) + 1;
		int firstQuarterMonth;
		if (month == 1 || month == 2 || month == 3) {
			firstQuarterMonth = 1;
		} else if (month == 4 || month == 5 || month == 6) {
			firstQuarterMonth = 4;
		} else if (month == 7 || month == 8 || month == 9) {
			firstQuarterMonth = 7;
		} else if (month == 10 || month == 11 || month == 12) {
			firstQuarterMonth = 10;
		} else {
			firstQuarterMonth = -1;
		}
		
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);		
	    calendar.set(Calendar.DAY_OF_MONTH, 1);
	    calendar.set(Calendar.MONTH, firstQuarterMonth - 1);
	    return calendar.getTime();
	}
	
	public static Date lastDayOfQuarter(Date inputDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		int month = calendar.get(Calendar.MONTH) + 1;
		int lastQuarterMonth;
		if (month == 1 || month == 2 || month == 3) {
			lastQuarterMonth = 3;
		} else if (month == 4 || month == 5 || month == 6) {
			lastQuarterMonth = 6;
		} else if (month == 7 || month == 8 || month == 9) {
			lastQuarterMonth = 9;
		} else if (month == 10 || month == 11 || month == 12) {
			lastQuarterMonth = 12;
		} else {
			lastQuarterMonth = -1;
		}		
		
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);		
		calendar.set(Calendar.MONTH, lastQuarterMonth - 1);
	    return calendar.getTime();
	}
	
	public static Date firstDayOfHalfYear(Date inputDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		int month = calendar.get(Calendar.MONTH) + 1;
		int firstHalfYearMonth;
		if (month == 1 || month == 2 || month == 3 || month == 4 || month == 5 || month == 6) {
			firstHalfYearMonth = 1;
		} else {
			firstHalfYearMonth = 7;
		}		
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);		
	    calendar.set(Calendar.DAY_OF_MONTH, 1);
	    calendar.set(Calendar.MONTH, firstHalfYearMonth - 1);
	    return calendar.getTime();
	}
	
	public static Date lastDayOfHalfYear(Date inputDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		int month = calendar.get(Calendar.MONTH) + 1;
		int lastHalfYearMonth;
		if (month == 1 || month == 2 || month == 3 || month == 4 || month == 5 || month == 6) {
			lastHalfYearMonth = 6;
		} else {
			lastHalfYearMonth = 12;
		}				
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);		
		calendar.set(Calendar.MONTH, lastHalfYearMonth - 1);
	    return calendar.getTime();
	}
	
	public static Date firstDayOfYear(Date inputDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);	
		calendar.set(Calendar.MONTH, 0);
	    calendar.set(Calendar.DAY_OF_MONTH, 1);
	    return calendar.getTime();
	}
	
	public static Date lastDayOfYear(Date inputDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.MONTH, 11);	    
	    return calendar.getTime();
	}
	
	public static Date beforeAnyDayOfDate(Date inputDate, int value) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);		
		calendar.add(Calendar.DATE, -value);
	    return calendar.getTime();
	}	
	
	public static int monthOfDate(Date inputDate) {
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int month = localDate.getMonthValue();
		return month;		
	}
	
	public static int quarterOfDate(Date inputDate) {
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int month = localDate.getMonthValue();
		if (month == 1 || month == 2 || month == 3) {
			return 1;
		} if (month == 4 || month == 5 || month == 6) {
			return 2;
		} if (month == 7 || month == 8 || month == 9) {
			return 3;
		} if (month == 10 || month == 11 || month == 12) {
			return 4;
		} else {
			return -1;
		}
	}
	
	public static int halfYearOfDate(Date inputDate) {
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int month = localDate.getMonthValue();
		if (month == 1 || month == 2 || month == 3 || month == 4 || month == 5 || month == 6) {
			return 1;
		} else {
			return 2;
		}
	}
	
	public static int yearOfDate(Date inputDate) {
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int year = localDate.getYear();
		return year;		
	}
	
	public static int firstMonthOfQuarter(int quarter) {
		if (quarter == 1) {
			return 1;
		} else if (quarter == 2) {
			return 4;
		} if (quarter == 3) {
			return 7;
		} if (quarter == 4) {
			return 10;
		} else {
			return 1;	
		}
	}
	
	public static int firstMonthOfHalfYear(int halfYear) {
		if (halfYear == 1) {
			return 1;
		} else {
			return 2;
		}		
	}
	
	
	public static Date calendarPeriodStart(int month, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.YEAR, year);
		Date start = calendar.getTime();
		return firstDayOfMonth(start);		
	} 

	public static Map<Integer, String> getMonths() {		
		Map<Integer, String> months = new HashMap<Integer, String>();
		for (int i = 1; i <= 12; i++) {
			Month monthNumber = Month.of(i);
			Locale locale = Locale.forLanguageTag("ru");
			String monthText = monthNumber.getDisplayName(TextStyle.FULL_STANDALONE, locale);
			months.put(i, monthText);
		}		
		return months;
	}
	
	public static Map<Integer, String> getQuarters() {		
		Map<Integer, String> quarters = new HashMap<>();
		for (int i = 1; i <= 4; i++) {
			String quarterText = String.valueOf(i) + "-й квартал";			
			quarters.put(i, quarterText);
		}		
		return quarters;
	}
	
	public static Map<Integer, String> getHalfYears() {		
		Map<Integer, String> halfYears = new HashMap<Integer, String>();
		for (int i = 1; i <= 2; i++) {
			String halfYearText = String.valueOf(i) + "-е полугодие";			
			halfYears.put(i, halfYearText);
		}		
		return halfYears;
	}

	public static Date sysDate() {		
		return truncateDate(new Date());
	}

}
