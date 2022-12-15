package org.nstern.demos.app;

import static org.nstern.demos.util.H.p;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.IsoFields;

public class DateDemo {

    static String dateString1 = "2018-01-01-00.00.00.000000";
    static String dateString2 = "2019-03-31T00:00:00";
    static String dateString3 = "2018-01-01-00.00.00.000000";
    static String pattern1 = "yyyy-MM-dd-HH.mm.ss.SSSSSS";
    static String pattern2 = "yyyy-MM-dd'T'HH.mm.ss.SSSSSS";

    public static void main(String[] args) {
        // throws a DateTimeParseException :
        // p("" + dateString1 + " - " + LocalDateTime.parse(dateString1));

        p("" + dateString1 + " - " + LocalDateTime.parse(dateString1, DateTimeFormatter.ofPattern(pattern1)));

        // throws a DateTimeParseException :
        // p("" + dateString1 + " - " + LocalDateTime.parse(dateString1, DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // throws a DateTimeParseException :
        // p("" + dateString1 + " - " + LocalDateTime.parse(dateString1, DateTimeFormatter.ISO_DATE_TIME));


        p("" + dateString2 + " - " + LocalDateTime.parse(dateString2));

        // throws a DateTimeParseException :
        // p("" + dateString2 + " - " + LocalDateTime.parse(dateString1, DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // throws a DateTimeParseException :
        // p("" + dateString2 + " - " + LocalDateTime.parse(dateString1, DateTimeFormatter.ISO_DATE_TIME));

        // throws a DateTimeParseException :
        // p("" + dateString2 + " - " + LocalDateTime.parse(dateString2, DateTimeFormatter.ofPattern(pattern2)));

        // determine quartal
        var d1 =  LocalDate.of(2022, 1, 1);
        var q1 =  d1.get(IsoFields.QUARTER_OF_YEAR);
        var d2 =  LocalDate.of(2022, 4, 1);
        var q2 =  d2.get(IsoFields.QUARTER_OF_YEAR);
        var d3 =  LocalDate.of(2022, 7, 1);
        var q3 =  d3.get(IsoFields.QUARTER_OF_YEAR);
        System.out.println(d1  + " is in quarter : " + q1);
        System.out.println(d2  + " is in quarter : " + q2);
        System.out.println(d3  + " is in quarter : " + q3);

        LocalDateTime start = LocalDateTime.of(1970, 1, 1, 0,0,0);
        LocalDateTime now = LocalDateTime.now();
        String diff = String.valueOf(ChronoUnit.MILLIS.between(start, now));

        int x = now.getNano();
        System.out.println("start  : "  + start);
        System.out.println("...  : "  + LocalDateTime.MIN);
        System.out.println("now  : "  + now);
        System.out.println("x  : "  + x);
        System.out.println("diff  : "  + diff);

        System.out.println("System.currentTimeMillis : " + System.currentTimeMillis());

//        now.atStartOfDay(gmt).toEpochSecond()(now).toEpochMilli();


    }
}
