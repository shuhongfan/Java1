package com.shf;

public class ThreadTest{
  public static void main(String[] args) {
    MyThread t1 = new MyThread();
//    启动当前线程 调用run方法
    t1.start();
//    t1.run();

    MyThread t2 = new MyThread();
    t2.start();


    for (int i = 0; i < 100; i++) {
      if (i%2!=0) System.out.println("**************");
    }
  }
}

//继承thread类
class MyThread extends Thread{
//  重写 run 方法
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if (i%2==0) System.out.println(Thread.currentThread().getName()+":"+i);
    }
  }
}

