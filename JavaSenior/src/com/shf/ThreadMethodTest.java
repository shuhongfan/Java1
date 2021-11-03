package com.shf;

public class ThreadMethodTest {
  public static void main(String[] args) {
    HelloThread s1=new HelloThread("线程1");
//    s1.setName("线程1");
    s1.setPriority(Thread.MAX_PRIORITY);
    s1.start();

    Thread.currentThread().setName("主线程");

    for (int i = 0; i < 100; i++) {
      if (i%2!=0) System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
      if (i==20) {
        try {
//          在线程a中调用线程b的join方法，此时线程a就进入阻塞状态，直到线程b安全执行完成之后，线程a就结束阻塞状态
          s1.join();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }

    System.out.println(s1.isAlive());
  }
}


class HelloThread extends Thread{
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if (i%2==0) {
        System.out.println(getName()+":"+getPriority()+":"+i);
        try {
          sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      if (i%20==0) this.yield(); // 释放当前cpu的执行权
    }
  }

  public HelloThread(String name){
    super(name);
  }
}