package com.shf;

public class Demo29 {
  public static void main(String[] args) {
    int[] arr=new int[6];
    int num;
    boolean flag;
    for (int i = 0; i < arr.length; i++) {
      flag=true;
      num=(int)(Math.random()*29+1);
      while (true){
        for (int j = 0; j<=i; j++) {
          if (arr[j]==num) flag=false;
        }
        if(flag==true){
          arr[i]=num;
          break;
        }
        if(flag==false){
          num=(int)(Math.random()*29+1);
          flag=true;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
