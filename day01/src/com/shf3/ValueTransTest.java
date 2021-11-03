package com.shf3;

import java.util.Arrays;

public class ValueTransTest {
  public static void main(String[] args) {
    int[] arr=new int[]{3,5,1,6};
    System.out.println(Arrays.toString(arr));

    ValueTransTest vt=new ValueTransTest();

    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length-1-i; j++) {
        if(arr[j]>arr[j+1]) vt.swap(arr,j,j+1);
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  public void swap(int[] arr,int m,int n){
    int temp=arr[m];
    arr[m]=arr[n];
    arr[n]=temp;
  }
}
