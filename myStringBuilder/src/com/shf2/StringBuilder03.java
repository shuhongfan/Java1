package com.shf2;

import java.util.Scanner;

public class StringBuilder03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        String s = reverse(line);
        System.out.println(s);
    }
    public static String reverse(String s){
//        StringBuilder sb=new StringBuilder(s);
//        sb.reverse();
//        String str=sb.toString();
//        return str;

        return new StringBuilder(s).reverse().toString();
    }
}
