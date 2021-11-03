package com.shf;

public class Demo24 {
  public static void main(String[] args) {
    int[] arr=new int[]{1,2,3};

    int[][] arr1=new int[][]{{1,2,3},{4,5},{6,7,8}};

    String[][] arr2=new String[3][2];
    String[][] arr3=new String[3][];

    String[][] arr4=new String[4][3];

    int arr5[]=new int[5];
    int[] arr6[]=new int[5][];

    System.out.println(arr1[0][1]);
    System.out.println(arr2[1][1]);

    arr3[1]=new String[4];
    System.out.println(arr3[1][0]);

    System.out.println(arr5[1]);

    System.out.println(arr2.length);
    System.out.println(arr2[0].length);

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[i].length; j++) {
        System.out.print(arr1[i][j]+"\t");
      }
      System.out.println();
    }
  }
}
