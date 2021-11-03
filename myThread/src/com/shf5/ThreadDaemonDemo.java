package com.shf5;

public class ThreadDaemonDemo {
  public static void main(String[] args) {
    ThreadDeamon td1=new ThreadDeamon();
    ThreadDeamon td2=new ThreadDeamon();

    td1.setName("关羽");
    td2.setName("张飞");

    Thread.currentThread().setName("刘备"); // 设置主线程为刘备
    td1.setDaemon(true); //设置为守护线程
    td2.setDaemon(true); // 设置为守护线程

    td1.start();
    td2.start();

    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName()+"："+i);
    }
  }
}
