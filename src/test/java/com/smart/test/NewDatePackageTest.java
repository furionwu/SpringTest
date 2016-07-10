package com.smart.test;

import java.time.*;

/**
 * Created by sony on 2016/7/10.
 */
public class NewDatePackageTest {
    public static void main(String[] args){
        Clock clock = Clock.systemUTC();
        System.out.println("当前时刻为"+clock.instant());
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());
        Duration d = Duration.ofSeconds(6000);
        System.out.println(d.toMinutes());
        System.out.println(d.toHours());
        System.out.println(d.toDays());
        Clock clock1 = Clock.offset(clock,d);
        System.out.println(clock1.instant());
        Instant instant = Instant.now();
        System.out.println(instant);
        Instant instant1 = instant.plusSeconds(6000);
        System.out.println(instant1);
        Instant instant3 = instant.parse("2014-02-23T10:12:35.342Z");
        System.out.println(instant3);
        Instant instant4 = instant3.plus(Duration.ofHours(5).plusMinutes(4));
        System.out.println(instant4);
        Instant instant5= instant4.minus(Duration.ofDays(5));
        System.out.println(instant5);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        localDate = LocalDate.ofYearDay(2014,146);
        System.out.println(localDate);
        localDate = LocalDate.of(2014, Month.MAY,21);
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
//        YearMonth




    }
}
