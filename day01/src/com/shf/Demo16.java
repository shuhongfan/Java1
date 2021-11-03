package com.shf;

public class Demo16 {
  public static void main(String[] args) {
    int count=0;
    for (int i = 2; i <= 100; i++) {
      if(prime(i)) {
        System.out.print(i+"\t");
        count++;
      }
    }
    System.out.println("100以内总共有"+count+"个质数");
  }
  public static boolean prime(int num){
    for (int i = 2; i < num; i++) {
      if(num%i==0) return false;
    }
    return true;
  }
}
