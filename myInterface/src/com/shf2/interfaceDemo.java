package com.shf2;

public class interfaceDemo {
    public static void main(String[] args) {
        Inter i=new InterImpl();
//        i.num=20;
        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(Inter.num);
    }
}
