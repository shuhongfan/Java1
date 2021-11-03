package com.shf4;

import org.junit.Test;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
  @Test
  public void test4(){
    Instant instant=Instant.now();
    System.out.println(instant);

    OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
    System.out.println(offsetDateTime);

    long milli = instant.toEpochMilli();
    System.out.println(milli);
  }

  @Test
  public void test3(){
//    now  当前时间日期
    LocalDate localDate = LocalDate.now();
    LocalTime localTime=LocalTime.now();
    System.out.println(localDate);
    System.out.println(localTime);

    LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 6, 13, 23, 43);
    System.out.println(localDateTime);
    System.out.println(localDateTime.getDayOfMonth());
    System.out.println(localDateTime.getDayOfWeek());
    System.out.println(localDateTime.getMonth());
    System.out.println(localDateTime.getMonthValue());
    System.out.println(localDateTime.getMinute());


    LocalDate localDate1=localDate.withDayOfMonth(22);
    System.out.println(localDate);
    System.out.println(localDate1);

    LocalDateTime localDateTime1 = localDateTime.withHour(4);
    System.out.println(localDateTime);
    System.out.println(localDateTime1);

    LocalDateTime localDateTime2 = localDateTime.plusMonths(3);
    System.out.println(localDateTime2);
  }

  @Test
  public void test2(){
    Date date1=new Date(2020-1990,9-1,8);
    System.out.println(date1);
  }

  @Test
  public void test1(){
    java.util.Calendar calendar= java.util.Calendar.getInstance();

    System.out.println(calendar.get(java.util.Calendar.DAY_OF_MONTH));
    System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

    calendar.set(Calendar.DAY_OF_MONTH,22);
    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    calendar.add(Calendar.DAY_OF_MONTH,3);
    calendar.add(Calendar.DAY_OF_MONTH,-1);
    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    Date date = calendar.getTime();
    System.out.println(date);

    Date date1=new Date();
    calendar.setTime(date1);
    System.out.println(Calendar.DAY_OF_YEAR);
  }
}
