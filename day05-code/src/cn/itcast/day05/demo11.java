package cn.itcast.day05;

import java.util.Arrays;

public class demo11 {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1) System.out.print(array[i]+"]");
            else System.out.print(array[i]+",");
        }

        System.out.println(Arrays.toString(array));
    }
}
