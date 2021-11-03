package com.shf1;

public class WindowTest2 {
  public static void main(String[] args) {
    Window2 window1 = new Window2();
    Window2 window2 = new Window2();
    Window2 window3 = new Window2();

    window1.setName("窗口1");
    window2.setName("窗口2");
    window3.setName("窗口3");

    window1.start();
    window2.start();
    window3.start();
  }
}


class Window2 extends Thread{
  private static int ticket=100;
  private static Object obj=new Object();

  @Override
  public void run() {
    while (true){
//      synchronized (obj){
      synchronized (Window2.class){
        if (ticket>0) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(getName()+": 买票，票号为："+ticket);
          ticket--;
        } else break;
      }
    }
  }
}


