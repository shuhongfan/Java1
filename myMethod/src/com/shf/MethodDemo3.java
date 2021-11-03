package com.shf;
//方法重载
//多个方法在同一个类中
//多个方法具有同一个方法名
//多个方法的参数不相同，类型不同或数量不同
public class MethodDemo3 {
    public static void main(String[] args) {
        int result=sum(10,20);
        System.out.println(result);

        double result2=sum(10.0,20.0);
        System.out.println(result2);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
