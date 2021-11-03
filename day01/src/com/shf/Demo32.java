package com.shf;

public class Demo32 {
  public static void main(String[] args) {
    String[] arr=new String[]{"JJ","DD","MM","BB","GG"};

    String[] arr1=new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
      arr1[i]=arr[i];
    }

    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr[i]+"\t");
    }
    System.out.println();

//    for (int i = 0; i < arr.length/2; i++) {
//      String temp=arr[i];
//      arr[i]=arr[arr.length-i-1];
//      arr[arr.length-i-1]=temp;
//    }
    for(int i=0,j=arr.length-1;i<j;i++,j--){
      String temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+"\t");
    }
    System.out.println();

    String desc="BB";
    boolean isFlag=true;
    for (int i = 0; i < arr.length; i++) {
      if(desc.equals(arr[i])) {
        System.out.println(arr[i]+"在第"+i+"个位置");
        isFlag=false;
        break;
      }
      if(isFlag) System.out.println("很遗憾，没有找到喔");
    }

    int[] arr2=new int[]{-98,-34,2,34,54,66,79,105,210,333};
    int dest1=-34;
    int head=0;
    int end=arr2.length-1;
    boolean isFlag1=true;
    while (head<=end){
      int middle=(head+end)/2;
      if(dest1==arr2[middle]) {
        System.out.println(arr[middle]+"在第"+middle+"个位置");
        isFlag1=false;
        break;
      }
      else if(arr2[middle]>dest1) end=middle-1;
      else if(arr2[middle]<dest1) head=middle+1;
    }
    if(isFlag1) System.out.println("很遗憾，没有找到喔");
  }
}
