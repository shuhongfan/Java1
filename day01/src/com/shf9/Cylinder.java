package com.shf9;

public class Cylinder extends Circle{
  private double length;

  public Cylinder(){
    length=1.0;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double findVolume(){
//    return Math.PI*getRadius()*getRadius();
    return findArea()*getLength();
  }

  @Override
  public double findArea() {
    return super.findArea();
  }
}
