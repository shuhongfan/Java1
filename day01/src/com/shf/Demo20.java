package com.shf;

public class Demo20 {
  public static void main(String[] args) {
    int factor;
    for (int i = 1; i <= 1000; i++) {
        factor=0;
        for(int j=1;j<=i/2;j++){
          if(i%j==0) factor+=j;
        }
        if(i==factor) System.out.println(i);
    }
  }
}
