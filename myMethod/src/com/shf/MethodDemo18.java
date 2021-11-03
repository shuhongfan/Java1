package com.shf;

import java.util.Arrays;

public class MethodDemo18 {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
