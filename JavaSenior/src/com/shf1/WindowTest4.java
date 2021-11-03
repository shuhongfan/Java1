package com.shf1;

public class WindowTest4 {
  public static void main(String[] args) {
    Window4 window1 = new Window4();
    Window4 window2 = new Window4();
    Window4 window3 = new Window4();

    window1.setName("窗口1");
    window2.setName("窗口2");
    window3.setName("窗口3");

    window1.start();
    window2.start();
    window3.start();
  }
}


class Window4 extends Thread{
  private static int ticket=100;

  @Override
  public void run() {
    while (true){
       show();
    }
  }

  private static synchronized void show(){  // 监视器 当前类本身
    if (ticket>0) {
      System.out.println(Thread.currentThread().getName()+": 买票，票号为："+ticket);
      ticket--;
    }
  }
}


