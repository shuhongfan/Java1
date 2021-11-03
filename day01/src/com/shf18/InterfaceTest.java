package com.shf18;

public class InterfaceTest {
  public static void main(String[] args) {
    System.out.println(Flyable.MAX_SPEED);
    System.out.println(Flyable.MIN_SPEED);
//    Flyable.MAX_SPEED=2;

    Plane plane = new Plane();
    plane.fly();
    plane.stop();
  }
}

interface Attackable{
  int attack=1;
}

interface Flyable{
//  全局常量
  public static final int MAX_SPEED=7900;
  public static final int MIN_SPEED=1;
//抽象方法
  public abstract void fly();
  void stop();

}

class Plane implements Flyable{
  @Override
  public void fly() {
    System.out.println("通过引擎起飞");
  }

  @Override
  public void stop() {
    System.out.println("驾驶员减速停止");
  }
}

abstract class kite implements Flyable{

}

class Bullet extends Object implements Flyable,Attackable{

  @Override
  public void fly() {

  }

  @Override
  public void stop() {

  }
}


interface AA{}
interface BB{}
interface CC extends AA,BB{

}