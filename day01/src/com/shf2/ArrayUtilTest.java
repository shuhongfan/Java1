package com.shf2;

public class ArrayUtilTest {
  public static void main(String[] args) {
    ArrayUtil util=new ArrayUtil();
    int[] arr=new int[]{32,34,32,5,3,54,654,-3};

    int max = util.getMax(arr);
    System.out.println("max="+max);

    int min = util.getMin(arr);
    System.out.println("min="+min);

    int sum = util.getSum(arr);
    System.out.println("sum="+sum);

    int avg = util.getAvg(arr);
    System.out.println("avg="+avg);


    int[] copy = util.copy(arr);
    System.out.print("复制的数组：");
    util.print(copy);

    util.sort(arr);
    System.out.print("排序的数组：");
    util.print(arr);

    util.reverse(arr);
    System.out.print("反序的数组：");
    util.print(arr);

    int index = util.getIndex(arr, 5);
    System.out.println("index="+index);
  }
}
