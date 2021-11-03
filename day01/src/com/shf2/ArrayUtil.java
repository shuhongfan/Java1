package com.shf2;

import java.util.Arrays;

public class ArrayUtil {

  public int getMax(int[] arr){
    int max=arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]>max) max=arr[i];
    }
    return max;
  }

  public int getMin(int[] arr){
    int min=arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]<min) min=arr[i];
    }
    return min;
  }

  public int getSum(int[] arr){
    int sum=0;
    for (int i = 0; i < arr.length; i++) {
      sum+=arr[i];
    }
    return sum;
  }

  public int getAvg(int[] arr){
    int sum = getSum(arr);
    int avg=sum/arr.length;
    return avg;
  }

  public void reverse(int[] arr){
    for (int i = 0; i < arr.length/2; i++) {
      int temp=arr[i];
      arr[i]=arr[arr.length-1-i];
      arr[arr.length-1-i]=temp;
    }
  }

  public int[] copy(int[] arr){
    int[] newArr=new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newArr[i]=arr[i];
    }
    return newArr;
  }

  public void sort(int[] arr){
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length-1-i; j++) {
        if(arr[j]>arr[j+1]) {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }

  public void print(int[] arr){
//    for (int i = 0; i < arr.length; i++) {
//      System.out.print(arr[i]+"\t");
//    }
//    System.out.println();

//    System.out.println(Arrays.toString(arr));

    String res="[";
    for (int i = 0; i < arr.length; i++) {
      res+=arr[i];
      if(i!=arr.length-1) res+=", ";
    }
    res+="]";
    System.out.println(res);
  }

  public int getIndex(int[] arr,int dest){
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]==dest) return i;
    }
    return -1;
  }
}
