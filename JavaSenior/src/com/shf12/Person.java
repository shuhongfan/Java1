package com.shf12;

import java.io.Serializable;

public class Person implements Serializable {
  static final long serialVersionUID = 42L;
  private String name;
  private  int age;
  private int id;
  private Account acct;

  public Person(String name, int age, int id, Account acct) {
    this.name = name;
    this.age = age;
    this.id = id;
    this.acct = acct;
  }

  public Person() {
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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Account getAcct() {
    return acct;
  }

  public void setAcct(Account acct) {
    this.acct = acct;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", id=" + id +
            ", acct=" + acct +
            '}';
  }
}


class Account implements Serializable{
  static final long serialVersionUID = 42L;

  private double balance;

  public Account(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  @Override
  public String toString() {
    return "Account{" +
            "balance=" + balance +
            '}';
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}