package com.shf;

public class ArrayDemo {
  public static void main(String[] args) {
    //
    int[] arr = {24, 69, 80, 57, 13};
    System.out.println("排序前：" + arrayToString(arr));

    for (int j = 0; j < arr.length-1; j++) {
      for (int i = 0; i < arr.length - 1 - j; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
      System.out.println("第"+(j+1)+"次比较后：" + arrayToString(arr));
    }
  }

  public static String arrayToString(int[] arr) {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) sb.append(arr[i]);
      else sb.append(arr[i]).append(", ");
    }
    sb.append("]");
    String s = sb.toString();
    return s;
  }
}
