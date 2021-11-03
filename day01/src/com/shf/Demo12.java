package com.shf;

import java.util.Scanner;

public class Demo12 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int positiveNumber=0;
    int negativeNumber=0;

    while(true){
      int number=sc.nextInt();

      if(number>0) positiveNumber++;
      else if(number<0) negativeNumber++;
      else break;
    }

    System.out.println("positiveNumber="+positiveNumber);
    System.out.println("negativeNumber="+negativeNumber);
  }
}
