package com.shf17;

public class MyInterfaceTest implements MyInterface{

  @Override
  public void methodAbstract() {

  }

  public static void main(String[] args) {
    MyInterface.methodStatic();

    MyInterfaceTest myInterfaceTest = new MyInterfaceTest();
    myInterfaceTest.methodDefault();

  }
}
