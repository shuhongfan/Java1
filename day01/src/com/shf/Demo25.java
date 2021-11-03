package com.shf;

public class Demo25 {
  public static void main(String[] args) {
    int[][] arr=new int[4][3];
    System.out.println(arr[0]);
    System.out.println(arr[0][0]);

    float[][] arr1=new float[4][3];
    System.out.println(arr1[0]);
    System.out.println(arr1[0][0]);

    String[][] arr2=new String[4][2];
    System.out.println(arr2[1]);
    System.out.println(arr2[1][1]);

    double[][] arr3=new double[4][];
    System.out.println(arr3[1]);
//    System.out.println(arr3[1][0]); // 报错

    int[] a1=new int[]{1,2};
    String[] a2=new String[]{"tom","jerry"};

    int[][] a3=new int[4][];
    int[][] a4=new int[][]{{1,2},{3,4}};
    for (int i = 0; i < a4.length; i++) {
      for (int j = 0; j < a4[i].length; j++) {
        System.out.print(a4[i][j]+"\t");
      }
      System.out.println();
    }
  }
}
