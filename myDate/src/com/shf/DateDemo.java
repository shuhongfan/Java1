package com.shf;

import java.util.Date;

public class DateDemo {
  public static void main(String[] args) {
      Date d1=new Date();
    System.out.println(d1);

    long date=1000*60*60;
    Date d2=new Date(date);
    System.out.println(d2);
  }
}
