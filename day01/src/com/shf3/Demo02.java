package com.shf3;

import java.util.Arrays;

public class Demo02 {
  public static void main(String[] args) {
    int[] arr=new int[]{12,3,3,34,56,77,432};

//    int num=arr[0];
//    for (int i = 0; i < arr.length; i++) {
//      arr[i]=arr[i]/num;
//    }

    for (int i = arr.length - 1; i >= 0; i--) {
      arr[i]=arr[i]/arr[0];
    }

    System.out.println(Arrays.toString(arr));

    int[] arr1=new int[]{1,2,3};
    System.out.println(arr1);

    char[] arr2=new char[]{'a','b','c','d'};
    System.out.println(arr2);
  }
}
