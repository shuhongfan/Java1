package com.shf16;

class Root{
  static {
    System.out.println("Root的静态初始化块");
  }
  {
    System.out.println("Root的普通初始化块");
  }
  public Root(){
    super();
    System.out.println("Root的无参数的构造器");
  }
}

class Mid extends Root{
  static {
    System.out.println("Mid的静态初始化块");
  }
  {
    System.out.println("Mid的普通初始化块");
  }
  public Mid(){
    super();
    System.out.println("Mid的无参数的构造器");
  }
  public Mid(String msg){
    this();
    System.out.println("Mid的带参数构造器，其参数值："+msg);
  }
}

class Leaf extends Mid{
  static {
    System.out.println("Left的静态初始化块");
  }
  {
    System.out.println("Leaf的普通初始化块");
  }
  public Leaf(){
    super("尚硅谷");
    System.out.println("Leaf的构造器");
  }
}

public class LeafTest {
  public static void main(String[] args) {
    new Leaf();
    System.out.println();
    new Leaf();
  }
}