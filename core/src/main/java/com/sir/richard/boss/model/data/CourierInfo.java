package com.sir.richard.boss.model.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sir.richard.boss.utils.DateTimeUtils;
import com.sir.richard.boss.utils.Pair;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CourierInfo extends Pair<LocalDateTime> {

    @Setter
    @Getter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATE_FORMAT_dd_MM_yyyy)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDate deliveryDate;

    public CourierInfo() {
        super();
    }

    public CourierInfo(LocalDateTime start, LocalDateTime end) {
        super(start, end);
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATE_FORMAT_HH_mm)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartTime() {
        if (getStart() != null) {
            return DateTimeUtils.formatLocalDateTime(getStart(), DateTimeUtils.DATE_FORMAT_HH_mm);
        } else {
            return null;
        }
    }

    public void setStartTime(String startTime) {

        if (StringUtils.isEmpty(startTime)) {
            setStart(null);
        }
        if ("  :  ".equals(startTime)) {
            setStart(null);
        }
        try {
            this.setStart(DateTimeUtils.stringToLocalDateTime(startTime, DateTimeUtils.DATE_FORMAT_HH_mm));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATE_FORMAT_HH_mm)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndTime() {
        if (getEnd() != null) {
            return DateTimeUtils.formatLocalDateTime(getEnd(), DateTimeUtils.DATE_FORMAT_HH_mm);
        } else {
            return null;
        }
    }

    public void setEndTime(String endTime) {
        if (StringUtils.isEmpty(endTime)) {
            setEnd(null);
        }
        try {
            this.setEnd(DateTimeUtils.stringToLocalDateTime(endTime, DateTimeUtils.DATE_FORMAT_HH_mm));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @JsonIgnore
    public String timeInterval() {
        if (this.getStart() == null && this.getEnd() == null) {
            return "";
        }
        String startTime = StringUtils.defaultString(DateTimeUtils.formatLocalDateTime(this.getStart(), DateTimeUtils.DATE_FORMAT_HH_mm));
        String endTime = StringUtils.defaultString(DateTimeUtils.formatLocalDateTime(this.getEnd(),
                DateTimeUtils.DATE_FORMAT_HH_mm));
        return startTime + " - " + endTime;
    }

    /*
    @Override
    public CourierInfo clone() throws CloneNotSupportedException  {
        super.clone();
        CourierInfo clone = new CourierInfo();
        clone.setStart(this.getStart() == null ? null : (Date) this.getStart().clone());
        clone.setEnd(this.getEnd() == null ? null : (Date) this.getEnd().clone());
        clone.deliveryDate = this.deliveryDate == null ? null : (Date) deliveryDate.clone();
        return clone;
    }
    */
}

