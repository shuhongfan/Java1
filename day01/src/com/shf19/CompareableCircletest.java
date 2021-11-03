package com.shf19;

public class CompareableCircletest {
  public static void main(String[] args) {
    ComparableCircle c1=new ComparableCircle(3.4);
    ComparableCircle c2=new ComparableCircle(3.6);

    int compare = c1.compareTo(c2);
    if (compare>0) System.out.println("C1对象大");
    else if (compare<0) System.out.println("C2对象大");
    else System.out.println("C1与一样大");

  }
}
