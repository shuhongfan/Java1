package com.shf4;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {
  @Test
  public void test4() throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date parse = simpleDateFormat.parse("2017-8-16");
    java.sql.Date date=new java.sql.Date(parse.getTime());
    System.out.println(date);
  }

  @Test
  public void test3() throws ParseException {
    String birth="2000-12-22";

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date parseDate = sdf.parse(birth);
    java.sql.Date sqlDate=new java.sql.Date(parseDate.getTime());
    System.out.println(sqlDate);
  }

  @Test
  public void test2() throws ParseException {
    String birth="2020-9-8";

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date date = simpleDateFormat.parse(birth);
    System.out.println(date);

    java.sql.Date birthDate=new java.sql.Date(date.getTime());
    System.out.println(birthDate);
  }

  @Test
  public void test1() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat();
    Date date = new Date();

    String format = sdf.format(date);
    System.out.println(format);

    String str="2019-08-09";
//    Date parse = sdf.parse(str);
//    System.out.println(parse);

    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MMMM.dd GG hh:mm:ss aaa");
    System.out.println(sdf2.format(date));

    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    System.out.println(sdf3.format(date));

    Date parse = sdf3.parse("2019-9-9 13:12:11");
    System.out.println(parse);
  }
}
