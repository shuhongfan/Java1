package com.shf12;

import java.util.Objects;

public class Customer {
  private String name;
  private int age;

  public Customer() {
  }

  public Customer(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this==o) return true;
    if (o instanceof Customer){
      Customer cust=(Customer) o;
      return this.age==cust.age && this.name.equals(cust.name);
    }
    return false;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
