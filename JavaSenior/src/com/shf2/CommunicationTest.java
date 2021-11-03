package com.shf2;

public class CommunicationTest {
  public static void main(String[] args) {
    Number number = new Number();

    Thread t1 = new Thread(number);
    Thread t2 = new Thread(number);
    t1.setName("线程1");
    t2.setName("线程2");
    t1.start();
    t2.start();
  }
}

class Number implements Runnable{
  private int number=1;
  @Override
  public void run() {
    while (true){
      synchronized (this){
        notifyAll(); // 唤醒线程
        if (number<=100){
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }

          System.out.println(Thread.currentThread().getName()+":"+number++);
//          阻塞 wait
          try {
            wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }

        }
        else break;
      }
    }
  }
}
