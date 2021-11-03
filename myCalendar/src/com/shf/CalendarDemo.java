package com.shf;

import java.util.Calendar;

public class CalendarDemo {
  public static void main(String[] args) {
    Calendar c=Calendar.getInstance();
    System.out.println(c);

    c.add(Calendar.YEAR,10);
    c.add(Calendar.DATE,-5);

    c.set(2048,11,11);
    int year=c.get(Calendar.YEAR);
    int month=c.get(Calendar.MARCH)+1;
    int date=c.get(Calendar.DATE);
    System.out.println(year+"年"+month+"月"+date+"日");


  }
}
