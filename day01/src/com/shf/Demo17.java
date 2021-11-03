package com.shf;

public class Demo17 {
  public static void main(String[] args) {
    int count=0;

    long start=System.currentTimeMillis();
    label:for(int i=2;i<=100;i++){
      for(int j=2;j<=Math.sqrt(i);j++)
        if (i % j == 0) continue label;

      System.out.print(i + "\t");
      count++;
    }
    System.out.println("\n100以内的素数有"+count+"个");
    long end=System.currentTimeMillis();

    System.out.println(end-start);
  }
}
