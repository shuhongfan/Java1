package com.shf;

public class WindowTest1 {
  public static void main(String[] args) {
    Window1 w1 = new Window1();

    Thread t1 = new Thread(w1);
    Thread t2 = new Thread(w1);
    Thread t3 = new Thread(w1);
    t1.setName("窗口1");
    t2.setName("窗口2");
    t3.setName("窗口3");

    t1.start();
    t2.start();
    t3.start();
  }
}

class Window1 implements Runnable{
  private int ticket=100; // 数据共享
  Object obj=new Object();

  @Override
  public void run() {
    while (true){
      synchronized (obj){
        if (ticket>0){
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(Thread.currentThread().getName()+": 买票，票号为："+ticket--);
        } else break;
      }
    }
  }
}
