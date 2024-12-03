package com.gsmserver.web.common;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static ZonedDateTime toZonedDateTimeFormat(String targetDate) {
        return ZonedDateTime.parse(targetDate, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
    }


    public static LocalDateTime toLocalDateTimeFormat(String targetDate) {
        return LocalDateTime.parse(targetDate, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

}
