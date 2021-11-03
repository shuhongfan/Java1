package com.shf13;

import com.shf12.Customer;

import java.util.Date;

public class ToStringTest {
  public static void main(String[] args) {
    Customer cust1=new Customer("Tom",21);
    System.out.println(cust1);
    System.out.println(cust1.toString());

    String str=new String("MM");
    System.out.println(str);

    Date date=new Date();
    System.out.println(date);
  }
}
