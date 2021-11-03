package com.shf;

import java.util.Scanner;

public class Demo08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入year");
    int year = sc.nextInt();
    System.out.println("请输入month");
    int month = sc.nextInt();
    System.out.println("请输入day：");
    int day = sc.nextInt();

    int sumDays = 0;
    switch (month) {
      case 12:
        sumDays += 30;
      case 11:
        sumDays += 31;
      case 10:
        sumDays += 30;
      case 9:
        sumDays += 31;
      case 8:
        sumDays += 31;
      case 7:
        sumDays += 30;
      case 6:
        sumDays += 31;
      case 5:
        sumDays += 30;
      case 4:
        sumDays += 31;
      case 3:
        if((year%4==0 && year%100!=0) || year%400==0) sumDays+=29;
        else sumDays += 28;
      case 2:
        sumDays += 31;
      case 1:
        sumDays += day;
    }

    System.out.println("2019年"+month+"月"+day+"日是当年的第"+sumDays+"天");
  }
}
