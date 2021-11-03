package com.shf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
  public static void main(String[] args) {
      Date d=new Date();
      SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
      String s = sdf.format(d);
    System.out.println(s);

    String ss="2048-08-09 11:11:11";
    SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      Date dd= null;
      try {
          dd = sdf2.parse(ss);
      } catch (ParseException e) {
          e.printStackTrace();
      }
      System.out.println(dd);
  }
}
