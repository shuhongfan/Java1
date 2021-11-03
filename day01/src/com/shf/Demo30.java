package com.shf;

public class Demo30 {
  public static void main(String[] args) {
    int[] arr=new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=(int)(Math.random()*(99-10+1)+10);  //[10-99]
      System.out.print(arr[i]+"\t");
    }
    System.out.println();

    int maxValue=arr[0];
    int minValue=arr[0];
    int sumValue=0;
    double avgValue=0;
    for (int i = 0; i < arr.length; i++) {
      sumValue+=arr[i];
      if(maxValue<arr[i]) maxValue=arr[i];
      if(minValue>arr[i]) minValue=arr[i];
    }
    avgValue=sumValue*1.0/arr.length;

    System.out.println("最大值："+maxValue);
    System.out.println("最小值："+minValue);
    System.out.println("总和："+sumValue);
    System.out.println("平均数："+avgValue);
  }
}
