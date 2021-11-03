package com.shf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo03 {
  public static void main(String[] args) {
    System.out.println("开始");
//    method2();
    System.out.println("结束");
  }
  public static void method() throws ArrayIndexOutOfBoundsException{
    int[] arr={1,2,3};
    System.out.println(arr[3]);
  }
  public static void method2() throws ParseException {
    String s="2048-09-09";
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    Date d=sdf.parse(s);
    System.out.println(d);
  }
}
