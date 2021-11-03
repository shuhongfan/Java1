package com.shf;

public class MethodDemo8 {
    public static void main(String[] args) {
        int[] arr={12,45,98,73,60};
        int result=getMax(arr);
        System.out.println(result);
    }
    public static int getMax(int[] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max) max=array[i];
        }
        return max;
    }
}
