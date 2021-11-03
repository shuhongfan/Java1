package com.shf17;

import java.util.Calendar;

public class Payrollsystem {
  public static void main(String[] args) {
    Calendar cale=Calendar.getInstance();
    int month=cale.get(Calendar.MONTH)+1;

    Employee[] emps=new Employee[2];

    emps[0]=new SalariedEmployee("泰森",1002,new MyDate(1992,2,28),10000);

    emps[1]=new HourlyEmployee("哇哈哈",2001,new MyDate(1991,8,6),60,240);

    for (int i = 0; i < emps.length; i++) {
      System.out.println(emps[i]);
      double salary = emps[i].earnings();
      System.out.println("月工资为："+salary);
      if (month==emps[i].getBirthday().getMonth()) System.out.println("生日快乐！奖励100元");
    }
  }
}
