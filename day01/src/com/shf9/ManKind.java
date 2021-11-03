package com.shf9;

public class ManKind {
  private int sex;
  private int salary;

  public void manOrWoman(){
    if(sex==1) System.out.printf("man");
    else if(sex==0) System.out.printf("woman");
  }

  public void employeed(){
    if (salary==0) System.out.printf("no job");
    else System.out.printf("job");
  }

  public ManKind() {
  }

  public ManKind(int sex, int salary) {
    this.sex = sex;
    this.salary = salary;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}
