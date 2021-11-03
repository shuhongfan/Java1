package com.shf;

public class Demo14 {
  public static void main(String[] args) {
    int i,j,k;
    for (i = 0; i < 5; i++) {
      for(j=0;j<4-i;j++) System.out.printf(" ");
      for(k=0;k<=i;k++) System.out.print("* ");
      System.out.println();
    }
    for (i = 0; i < 4; i++) {
      for(j=0;j<=i;j++) System.out.printf(" ");
      for(k=0;k<4-i;k++) System.out.print("* ");
      System.out.println();
    }
  }
}
