package com.shf;

public class MethodDemo16 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        int[] arr2={11,22,33,44,5};
        System.out.println(compare(arr,arr2));
    }
    public static boolean compare(int[] arr,int[] arr2){
        if(arr.length!=arr2.length) return false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr2[i]) return false;
        }
        return true;
    }
}
