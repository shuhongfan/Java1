package com.shf5;

public class Student {
  private String name;
  private int age;
  private String school;
  private String major;

  public Student(){}

  public Student(String n,int a){
    name=n;
    age=a;
  }

  public Student(String n,int a,String s){
    name=n;
    age=a;
    school=s;
  }

  public Student(String n,int a,String s,String m){
    name=n;
    age=a;
    school=s;
    major=m;
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

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }
}
