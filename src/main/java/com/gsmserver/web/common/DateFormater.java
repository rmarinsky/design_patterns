package com.gsmserver.web.common;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormater {

    private String decoratedFormatter;

    public DateFormater(String decoratedFormatter) {
        this.decoratedFormatter = decoratedFormatter;
    }

    public ZonedDateTime toZonedDateTimeFormat() {
        return ZonedDateTime.parse(decoratedFormatter, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
    }


    public LocalDateTime toLocalDateTimeFormat() {
        return LocalDateTime.parse(decoratedFormatter, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }


    public static void main(String[] args) {
        new DateFormater("2021-07-01T12:00:00.000+0000").toZonedDateTimeFormat();
        DateUtils.toZonedDateTimeFormat("2021-07-01T12:00:00.000+0000");
    }

}

