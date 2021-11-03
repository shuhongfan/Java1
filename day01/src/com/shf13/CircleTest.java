package com.shf13;

public class CircleTest {
  public static void main(String[] args) {
    Circle circle=new Circle(2.3);
    Circle circle2=new Circle("white",2.0,2.3);

    System.out.println(circle.getColor().equals(circle2.getColor()));
    System.out.println(circle.equals(circle2));

    System.out.println(circle);
    System.out.println(circle2);
  }
}
