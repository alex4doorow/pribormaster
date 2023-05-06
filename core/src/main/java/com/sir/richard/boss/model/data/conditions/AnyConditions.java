package com.sir.richard.boss.model.data.conditions;

import com.sir.richard.boss.model.types.*;
import com.sir.richard.boss.utils.DateTimeUtils;
import com.sir.richard.boss.utils.Pair;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
public class AnyConditions {
    private Pair<LocalDate> period;
    private ReportPeriodTypes reportPeriodType;
    private int reportPeriodMonth;
    private int reportPeriodQuarter;
    private int reportPeriodHalfYear;
    private int reportPeriodYear;
    private Set<DeliveryTypes> deliveryTypes;
    private Set<CustomerTypes> customerTypes;
    private Set<PaymentTypes> paymentTypes;
    private Set<OrderAdvertTypes> advertTypes;
    private Set<OrderStatuses> statuses;
    private Set<OrderTypes> types;

    public AnyConditions() {
        deliveryTypes = new HashSet<DeliveryTypes>();
        customerTypes = new HashSet<CustomerTypes>();
        paymentTypes = new HashSet<PaymentTypes>();
        advertTypes = new HashSet<OrderAdvertTypes>();

        statuses = new HashSet<OrderStatuses>();
        types = new HashSet<OrderTypes>();
        this.reportPeriodType = ReportPeriodTypes.ANY_MONTH;
        this.period = new Pair<>(LocalDate.now(), LocalDate.now());
    }

    public AnyConditions(LocalDate periodStart, LocalDate periodEnd) {
        this();
        this.period = new Pair<>(periodStart, periodEnd);
    }

    public AnyConditions(ReportPeriodTypes reportPeriodType, Date inputDate) {
        this();
        this.reportPeriodType = reportPeriodType;
        setPeriodByType(this.reportPeriodType, LocalDate.now());
    }

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    public LocalDate getPeriodStart() {
        return period.getStart();
    }

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    public void setPeriodStart(LocalDate periodStart) {
        period.setStart(periodStart);
    }

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    public LocalDate getPeriodEnd() {
        return period.getEnd();
    }

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    public void setPeriodEnd(LocalDate periodEnd) {
        period.setEnd(periodEnd);
    }

    public Pair<LocalDate> findPeriodByType(ReportPeriodTypes type, LocalDate date) {
        LocalDate start = date;
        LocalDate end = date;
/*
        if (type == ReportPeriodTypes.CURRENT_MONTH) {
            start = DateTimeUtils.firstDayOfMonth(date);
            end = DateTimeUtils.lastDayOfMonth(start);
        } else if (type == ReportPeriodTypes.PRIOR_MONTH) {
            Date firstDateOfMonth = DateTimeUtils.firstDayOfMonth(date);
            start = DateTimeUtils.firstDayOfMonth(DateTimeUtils.beforeAnyDayOfDate(firstDateOfMonth, 1));
            end = DateTimeUtils.lastDayOfMonth(start);
        } else if (type == ReportPeriodTypes.CURRENT_QUARTER) {
            start = DateTimeUtils.firstDayOfQuarter(date);
            end = DateTimeUtils.lastDayOfQuarter(start);
        } else if (type == ReportPeriodTypes.CURRENT_YEAR) {
            start = DateTimeUtils.firstDayOfYear(date);
            end = DateTimeUtils.lastDayOfYear(start);
        } else if (type == ReportPeriodTypes.LAST_7_DAYS) {
            end = DateTimeUtils.truncateDate(date);
            start = DateTimeUtils.beforeAnyDayOfDate(end, 7);
        } else if (type == ReportPeriodTypes.LAST_30_DAYS) {
            end = DateTimeUtils.truncateDate(date);
            start = DateTimeUtils.beforeAnyDayOfDate(end, 30);
        } else if (type == ReportPeriodTypes.LAST_90_DAYS) {
            end = DateTimeUtils.truncateDate(date);
            start = DateTimeUtils.beforeAnyDayOfDate(end, 90);
        } else if (type == ReportPeriodTypes.CURRENT_HALF_YEAR) {
            start = DateTimeUtils.firstDayOfHalfYear(date);
            end = DateTimeUtils.lastDayOfHalfYear(start);
        } else {
            start = DateTimeUtils.truncateDate(new Date());
            end = DateTimeUtils.truncateDate(new Date());
        }

 */
        return new Pair<>(start, end);
    }

    public void setPeriodByType(ReportPeriodTypes type, LocalDate inputDate) {
        Pair<LocalDate> period = findPeriodByType(type, inputDate);
        setPeriod(period);
/*
        this.reportPeriodMonth = DateTimeUtils.monthOfDate(period.getStart());
        this.reportPeriodQuarter = DateTimeUtils.quarterOfDate(period.getStart());
        this.reportPeriodHalfYear = DateTimeUtils.halfYearOfDate(period.getStart());
        this.reportPeriodYear = DateTimeUtils.yearOfDate(period.getStart());

 */
    }

}
