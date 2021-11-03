package com.shf8;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
  @Test
  public void test2(){
    TreeSet<Employee> set=new TreeSet(new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        MyDate b1 = o1.getBirthday();
        MyDate b2 = o2.getBirthday();
//          int year=b1.getYear()-b2.getYear();
//          if (year!=0) return year;
//
//          int month=b1.getMonth()-b2.getMonth();
//          if (month!=0) return month;
//
//          return b1.getDay()-b2.getDay();
        return b1.compareTo(b2);
      }
    });
    Employee e1 = new Employee("liudehua",55,new MyDate(1965,5,4));
    Employee e2 = new Employee("zhangxueyou",43,new MyDate(1987,5,4));
    Employee e3 = new Employee("guofucheng",44,new MyDate(1987,5,9));
    Employee e4 = new Employee("liming",51,new MyDate(1954,8,12));
    Employee e5 = new Employee("liangchaowei",21,new MyDate(1978,12,4));
    set.add(e1);
    set.add(e2);
    set.add(e3);
    set.add(e4);
    set.add(e5);

    Iterator<Employee> iterator = set.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());
  }

  @Test
  public void test1(){
    TreeSet<Employee> set=new TreeSet<>();
    Employee e1 = new Employee("liudehua",55,new MyDate(1965,5,4));
    Employee e2 = new Employee("zhangxueyou",43,new MyDate(1987,5,4));
    Employee e3 = new Employee("guofucheng",44,new MyDate(1987,5,9));
    Employee e4 = new Employee("liming",51,new MyDate(1954,8,12));
    Employee e5 = new Employee("liangchaowei",21,new MyDate(1978,12,4));
    set.add(e1);
    set.add(e2);
    set.add(e3);
    set.add(e4);
    set.add(e5);

    Iterator<Employee> iterator = set.iterator();
    while (iterator.hasNext()) {
      Employee next = iterator.next();
      System.out.println(next);
    }
  }
}
