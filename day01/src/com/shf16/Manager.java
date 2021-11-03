package com.shf16;

public class Manager extends Employee{
  private double bonus;

  public Manager(double bonus) {
    super();
    this.bonus = bonus;
  }

  public Manager(String name, int id, double salary, double bonus) {
    super(name, id, salary);
    this.bonus = bonus;
  }

  @Override
  public void work() {
    System.out.println("管理员工，提高公司运行的效率");
  }

}
