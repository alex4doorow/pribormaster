package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.entity.TeUser;
import com.sir.richard.boss.bl.jpa.TeUserQueryRepository;
import com.sir.richard.boss.model.data.conditions.OrderConditions;
import com.sir.richard.boss.model.types.ReportPeriodTypes;
import com.sir.richard.boss.utils.DateTimeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;

@Service
@Slf4j
public class ConfigService {

    @Autowired
    private TeUserQueryRepository userQueryRepository;

    public OrderConditions loadOrderConditions(TeUser user) {

        OrderConditions conditions = new OrderConditions();

        int reportPeriodTypeId = getFormIntegerValueByKey(user.getId(), "orderConditionsForm", "reportPeriodType", ReportPeriodTypes.ANY_PERIOD.getId());
        conditions.setReportPeriodType(ReportPeriodTypes.getValueById(reportPeriodTypeId));

        conditions.setPeriodExist(getFormBooleanValueByKey(user.getId(), "orderConditionsForm", "periodExist", true));
        //conditions.setReportPeriodMonth(getFormIntegerValueByKey(user.getId(), "orderConditionsForm", "reportPeriodMonth", DateTimeUtils.monthOfDate(new Date())));
        //conditions.setReportPeriodYear(getFormIntegerValueByKey(user.getId(), "orderConditionsForm", "reportPeriodYear", DateTimeUtils.yearOfDate(new Date())));

        conditions.setNo(getFormStringValueByKey(user.getId(), "orderConditionsForm", "no", ""));
        conditions.setTrackCode(getDefaultFormStringValueByKey(user.getId(), "orderConditionsForm", "trackCode"));
        conditions.setDeliveryAddress(getDefaultFormStringValueByKey(user.getId(), "orderConditionsForm", "deliveryAddress"));

        /*
        int productId = getFormIntegerValueByKey(user.getId(), "orderConditionsForm", "product", 0);
        if (productId > 0) {
            conditions.setProduct(wikiDao.getProductById(productId));
        } else {
            conditions.setProduct(Product.createEmpty());
        }
        conditions.getCustomerConditions().setPersonPhoneNumber(getDefaultFormStringValueByKey(user.getId(), "orderConditionsForm", "customerConditions.person.phoneNumber"));
        conditions.getCustomerConditions().setPersonEmail(getDefaultFormStringValueByKey(user.getId(), "orderConditionsForm", "customerConditions.person.email"));
        conditions.getCustomerConditions().setPersonLastName(getDefaultFormStringValueByKey(user.getId(), "orderConditionsForm", "customerConditions.person.lastName"));
        conditions.getCustomerConditions().setCompanyInn(getDefaultFormStringValueByKey(user.getId(), "orderConditionsForm", "customerConditions.company.inn"));
        conditions.getCustomerConditions().setCompanyShortName(getDefaultFormStringValueByKey(user.getId(), "orderConditionsForm", "customerConditions.company.shortName"));
*/
        LocalDate periodStart = getFormDateValueByKey(user.getId(), "orderConditionsForm", "period.start", LocalDate.now());
        LocalDate periodEnd = getFormDateValueByKey(user.getId(), "orderConditionsForm", "period.end", LocalDate.now());

        conditions.getPeriod().setStart(periodStart);
        conditions.getPeriod().setEnd(periodEnd);
/*
        Set<Object> dirtyStatuses = TextUtils.getStatusesByArray(getFormStringValueByKey(user.getId(), "orderConditionsForm", "statuses", ""), OrderStatuses.class);
        conditions.setDirtyStatuses(dirtyStatuses);

        Set<OrderTypes> orderTypes = OrderTypes.getStatusesByArray(getFormStringValueByKey(user.getId(), "orderConditionsForm", "orderTypes", ""));
        conditions.setTypes(orderTypes);

        Set<Object> dirtyDeliveryTypes = TextUtils.getStatusesByArray(getFormStringValueByKey(user.getId(), "orderConditionsForm", "deliveryTypes", ""), DeliveryTypes.class);
        conditions.setDirtyDeliveryTypes(dirtyDeliveryTypes);

        Set<Object> dirtyCustomerTypes = TextUtils.getStatusesByArray(getFormStringValueByKey(user.getId(), "orderConditionsForm", "customerTypes", ""), CustomerTypes.class);
        conditions.setDirtyCustomerTypes(dirtyCustomerTypes);

        Set<Object> dirtyPaymentTypes = TextUtils.getStatusesByArray(getFormStringValueByKey(user.getId(), "orderConditionsForm", "paymentTypes", ""), PaymentTypes.class);
        conditions.setDirtyPaymentTypes(dirtyPaymentTypes);

        Set<Object> dirtyAdvertTypes = TextUtils.getStatusesByArray(getFormStringValueByKey(user.getId(), "orderConditionsForm", "advertTypes", ""), OrderAdvertTypes.class);
        conditions.setDirtyAdvertTypes(dirtyAdvertTypes);
*/
        return conditions;
    }

    public LocalDate getFormDateValueByKey(Long userId, String formCode, String key, LocalDate defaultValue) {
        String value = getFormStringValueByKey(userId, formCode, key, null);
        try {
            return StringUtils.isEmpty(value) ? defaultValue : DateTimeUtils.defaultFormatStringToLocalDate(value);
        } catch (ParseException e) {
            log.error("error getFormDateValueByKey(): {},{},{}", formCode, key, value, e);
            return null;
        }
    }

    public int getFormIntegerValueByKey(Long userId, String formCode, String key, int defaultValue) {
        String value = getFormStringValueByKey(userId, formCode, key, null);
        try {
            return StringUtils.isEmpty(value) ? defaultValue : Integer.parseInt(value);
        } catch (Exception e) {
            log.error("error getFormIntegerValueByKey(): {},{},{}", formCode, key, value, e);
            return defaultValue;
        }
    }

    public boolean getFormBooleanValueByKey(Long userId, String formCode, String key, boolean defaultValue) {
        int value = getFormIntegerValueByKey(userId, formCode, key, 0);
        return value != 0;
    }

    public BigDecimal getFormBigDecimalValueByKey(Long userId, String formCode, String key, BigDecimal defaultValue) {
        String value = getFormStringValueByKey(userId, formCode, key, null);
        try {
            return StringUtils.isEmpty(value) ? defaultValue : new BigDecimal(value);
        } catch (Exception e) {
            log.error("error getFormBigDecimalValueByKey(): {},{},{}", formCode, key, value, e);
            return defaultValue;
        }
    }

    public String getFormStringValueByKey(Long userId, String formCode, String key, String defaultValue) {
        String value = userQueryRepository.findValueByUserFormCode(userId, formCode, key);
        return StringUtils.defaultIfEmpty(value, defaultValue);
    }

    public String getDefaultFormStringValueByKey(Long userId, String formCode, String key) {
        return getFormStringValueByKey(userId, formCode, key, "");
    }
}
