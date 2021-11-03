package com.shf;

import java.util.Date;

public class DateDemo2 {
  public static void main(String[] args) {
    Date d = new Date();
    System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

    long time=1000*60*60;
    d.setTime(time);
    System.out.println(d);
  }
}
