package com.shf;

import java.util.Scanner;

public class MethodDemo17 {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查找的数据：");
        int number= sc.nextInt();
        System.out.println(getIndex(arr,number));
    }
    public static int getIndex(int[] arr,int number){
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(number==arr[i]) {index=i;break;}
        }
        return index;
    }
}
