package com.shf;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]);

        arr=null;
        System.out.println(arr[0]);
    }
}
