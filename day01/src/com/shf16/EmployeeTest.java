package com.shf16;

public class EmployeeTest {
  public static void main(String[] args) {
    Manager manager=new Manager("库克",1001,5000,50000);
    manager.work();

    CommonEmployee commonEmployee = new CommonEmployee();
    commonEmployee.work();
  }
}
