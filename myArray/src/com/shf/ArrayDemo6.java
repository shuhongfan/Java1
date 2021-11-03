package com.shf;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int[] arr={12,45,98,73,60};
        int max,min;
        max=min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
