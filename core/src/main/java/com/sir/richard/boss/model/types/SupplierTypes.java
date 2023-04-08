package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
public enum SupplierTypes {
		
	//UNKNOWN(0, "неопределен"),
	SITITEK(1, "СИТИТЕК"),
	Z1_VEK(2, "ЭКОСНАЙПЕР"),
	DADJET(3, "ДАДЖЕТ"),
	CAMPING_2000(4, "КЕМПИНГ 2000"),
	T4L(5, "ТЕХНОЛОГИИ ДЛЯ ЖИЗНИ"),
	LADIA(6, "ЛАДЬЯ"),
	ELANG(7, "ЭЛАНГ"),
	TELEMETRIKA(8, "ТЕЛЕМЕТРИКА"),
	UST(9, "ЮСТ"),
	MIGOWATT(10, "МИГОВАТТ"),
	SLEDOPYT(11, "СЛЕДОПЫТ"),
	PYROHOUSE(12, "ПИРОХАУС"),
	HOONT(14, "HOONT"),
	CARKU(15, "CARKU"),
	TORNADO(16, "ТОРНАДО"),
	RUSONAR(17, "ПРАКТИК"),
	SLEDOPYT_YANDEX_MARKET_FISHING(21, "СЛЕДОПЫТ ЯМ-РЫБАЛКА");
				
	private final int id;
    private final String annotation;

	public static SupplierTypes getValueById(int value) {
		if (value == 1) {
			return SupplierTypes.SITITEK;
		} else if (value == 2) {
			return SupplierTypes.Z1_VEK;
		} else if (value == 3) {
			return SupplierTypes.DADJET;
		} else if (value == 4) {
			return SupplierTypes.CAMPING_2000;
		} else if (value == 5) {
			return SupplierTypes.T4L;
		} else if (value == 6) {
			return SupplierTypes.LADIA;
		} else if (value == 7) {
			return SupplierTypes.ELANG;
		} else if (value == 8) {
			return SupplierTypes.TELEMETRIKA;
		} else if (value == 9) {
			return SupplierTypes.UST;
		} else if (value == 10) {
			return SupplierTypes.MIGOWATT;
		} else if (value == 11) {
			return SupplierTypes.SLEDOPYT;
		} else if (value == 12) {
			return SupplierTypes.PYROHOUSE;
		} else if (value == 14) {
			return SupplierTypes.HOONT;
		} else if (value == 15) {
			return SupplierTypes.CARKU;
		} else if (value == 16) {
			return SupplierTypes.TORNADO;
		} else if (value == 17) {
			return SupplierTypes.RUSONAR;
		} else if (value == 21) {
			return SupplierTypes.SLEDOPYT_YANDEX_MARKET_FISHING;
		} else {
			return null;
		} 		
	}  
	
	public static SupplierTypes getValueByAnnotation(String value) {
		if (value.equals(SupplierTypes.SITITEK.getAnnotation())) {
			return SupplierTypes.SITITEK;
		} else if (value.equals(SupplierTypes.Z1_VEK.getAnnotation())) {
			return SupplierTypes.Z1_VEK;
		} else if (value.equals(SupplierTypes.DADJET.getAnnotation())) {
			return SupplierTypes.DADJET;
		} else if (value.equals(SupplierTypes.CAMPING_2000.getAnnotation())) {
			return SupplierTypes.CAMPING_2000;
		} else if (value.equals(SupplierTypes.T4L.getAnnotation())) {
			return SupplierTypes.T4L;
		} else if (value.equals(SupplierTypes.LADIA.getAnnotation())) {
			return SupplierTypes.LADIA;
		} else if (value.equals(SupplierTypes.ELANG.getAnnotation())) {
			return SupplierTypes.ELANG;
		} else if (value.equals(SupplierTypes.TELEMETRIKA.getAnnotation())) {
			return SupplierTypes.TELEMETRIKA;
		} else if (value.equals(SupplierTypes.UST.getAnnotation())) {
			return SupplierTypes.UST;
		} else if (value.equals(SupplierTypes.MIGOWATT.getAnnotation())) {
			return SupplierTypes.MIGOWATT;
		} else if (value.equals(SupplierTypes.SLEDOPYT.getAnnotation())) {
			return SupplierTypes.SLEDOPYT;
		} else if (value.equals(SupplierTypes.PYROHOUSE.getAnnotation())) {
			return SupplierTypes.PYROHOUSE;
		} else if (value.equals(SupplierTypes.HOONT.getAnnotation())) {
			return SupplierTypes.HOONT;
		} else if (value.equals(SupplierTypes.CARKU.getAnnotation())) {
			return SupplierTypes.CARKU;
		} else if (value.equals(SupplierTypes.TORNADO.getAnnotation())) {
			return SupplierTypes.TORNADO;
		} else if (value.equals(SupplierTypes.RUSONAR.getAnnotation())) {
			return SupplierTypes.RUSONAR;
		} else if (value.equals(SupplierTypes.SLEDOPYT_YANDEX_MARKET_FISHING.getAnnotation())) {
			return SupplierTypes.SLEDOPYT_YANDEX_MARKET_FISHING;
		} else {
			return null;
		}		
	}		
	
	public static Set<SupplierTypes> getStatusesByArray(String strSuppliers) {
		Set<SupplierTypes> suppliers = new HashSet<SupplierTypes>();
		if (StringUtils.isEmpty(strSuppliers)) {
			return suppliers;
		}
		final String spliter = ",";
		String[] arrSuppliers = strSuppliers.split(spliter);		
		for (String arrSupplier : arrSuppliers) {
			SupplierTypes supplier = SupplierTypes.getValueById(Integer.valueOf(arrSupplier));
			suppliers.add(supplier);
		}
		return suppliers;
	}
			
	public static String getArrayByStatuses(Set<SupplierTypes> suppliers) {
		if (suppliers == null || suppliers.size() == 0) {
			return "";
		}		
		final String spliter = ",";
		String result = "";
		for (SupplierTypes supplier : suppliers) {			
			result += String.valueOf(supplier.getId()) + spliter;			
		}		
		result = result.trim();
		String spliter1 = result.substring(result.length() - 1, result.length()).trim();
		if (spliter1.equals(spliter)) {
			result = result.substring(0,  result.length() - 1);
		}		
		return result.trim();		
	}	

}
