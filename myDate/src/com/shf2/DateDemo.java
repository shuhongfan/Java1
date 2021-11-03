package com.shf2;

import java.util.Date;

public class DateDemo {
  public static void main(String[] args) {
    //
    Date d = new Date();
    String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
    System.out.println(s1);

    String s2 = DateUtils.dateToString(d, "yyyy年MM月dd日");
    System.out.println(s2);

    String s3 = DateUtils.dateToString(d,"HH:mm:ss");
    System.out.println(s3);

    String s="2048-08-09 12:12:12";
    Date d1 = DateUtils.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
    System.out.println(d1);
  }
}
