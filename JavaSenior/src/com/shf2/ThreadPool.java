package com.shf2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    executorService.execute(new NumberThread());
//    executorService.submit();
  }
}

class NumberThread implements Runnable{
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if (i%2==0) System.out.println(i);
    }
  }
}
