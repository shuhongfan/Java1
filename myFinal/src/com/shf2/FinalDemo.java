package com.shf2;

public class FinalDemo {
    public static void main(String[] args) {
//        final修饰基本类型变量
        final int age=20;
//        age=100;  //  内容产量不可变
        System.out.println(age);


//        final修饰引用类型变量  地址值不能变，内容可变
        final Student s=new Student();
        s.age=100;
        System.out.println(s.age);

//        s=new Student();
    }
}
