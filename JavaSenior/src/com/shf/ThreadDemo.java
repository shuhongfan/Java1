package com.shf;

public class ThreadDemo {
  public static void main(String[] args) {
//    Thread1 thread1 = new Thread1();
//    thread1.start();
//    Thread2 thread2 = new Thread2();
//    thread2.start();

//    new Thread1().start();
//    new Thread2().start();

//    thread匿名子类
    new Thread(){
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          if (i%2==0) System.out.println(i+Thread.currentThread().getName());
        }
      }
    };

    new Thread(){
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          if (i%2!=0) System.out.println(i+Thread.currentThread().getName());
        }
      }
    };
  }
}


class Thread1 extends Thread{
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if (i%2==0) System.out.println(i+Thread.currentThread().getName());
    }
  }
}

class Thread2 extends Thread{
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if (i%2!=0) System.out.println(i+Thread.currentThread().getName());
    }
  }
}