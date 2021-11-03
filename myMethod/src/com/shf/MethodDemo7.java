package com.shf;

public class MethodDemo7 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        printfArray(arr);
    }
    public static void printfArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1) System.out.print(array[i]);
            else System.out.print(array[i]+", ");
        }
        System.out.println("]");
    }
}
