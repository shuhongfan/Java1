package com.shf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo02 {
  public static void main(String[] args) {
    method();
    method2();
  }

  public static void method2(){
    try {
      String s="2021-7-14";
      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
      Date d= null;
      d = sdf.parse(s);
      System.out.println(d);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  public static void method(){
    try{
      int[] arr={1,2,3};
      System.out.println(arr[3]);
    } catch (ArrayIndexOutOfBoundsException e){
      System.out.println(e.toString());
    }
  }
}
