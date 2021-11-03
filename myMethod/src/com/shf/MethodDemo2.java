package com.shf;

public class MethodDemo2 {
    public static void main(String[] args) {
        int a=10,b=20;
        int result=getMax(a,b);
        System.out.println(result);
    }
    public static int getMax(int a,int b){
        return a>b?a:b;
    }
}
