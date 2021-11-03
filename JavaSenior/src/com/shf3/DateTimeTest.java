package com.shf3;

import org.junit.Test;

import java.util.Date;

public class DateTimeTest {
  @Test
  public void test2(){
    Date date = new Date();
    System.out.println(date.toString());
    System.out.println(date.getTime());

    Date date2=new Date(1628323780649L);
    System.out.println(date2);

    java.sql.Date data3=new java.sql.Date(1628323780649L);
    System.out.println(data3);

    Date data4=new java.sql.Date(1628323780649L);
    java.sql.Date date5=(java.sql.Date) data4;


  }

  @Test
  public void test1(){
    long time=System.currentTimeMillis();
    System.out.println(time);
  }
}
