package com.shf17;

public interface MyInterface {
  void methodAbstract();
  static void methodStatic(){
    System.out.println("我是接口中的静态方法");
  }
  default void methodDefault(){
    System.out.println("我是接口中的默认方法");
  }

  private void methodPrivate(){

  }
}
