package com.shf3;

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        String re = reverseN(line);
        System.out.println(re);
    }
    public static String reverse(String s){
        String ss="";
        for (int i=0; i < s.length(); i++) {
            ss+=s.charAt(s.length()-i-1);
        }
        return ss;
    }
    public static String reverseN(String s){
        String ss="";
        for(int i=s.length()-1;i>=0;i--){
            ss+=s.charAt(i);
        }
        return ss;
    }
}
