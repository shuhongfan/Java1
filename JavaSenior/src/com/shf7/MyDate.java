package com.shf7;

public class MyDate implements Comparable{
  private int year;
  private int month;
  private int day;

  public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public MyDate() {
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  @Override
  public String toString() {
    return "MyDate{" +
            "year=" + year +
            ", month=" + month +
            ", day=" + day +
            '}';
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof MyDate){
      MyDate m=(MyDate) o;
      int year=m.getYear()-this.getYear();
      if (year!=0) return year;

      int month=m.getMonth()-this.getMonth();
      if (month!=0) return month;

      return m.getDay()-this.getDay();
    }
    throw new RuntimeException("传入的类型不一致");
  }
}
