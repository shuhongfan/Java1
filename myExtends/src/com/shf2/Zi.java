package com.shf2;

public class Zi extends Fu{
    public int height=175;
    public int age=75;
    public void show(){
        int age=30;
//        父类对象引用
        System.out.println(super.age);
//        本类的成员变量
        System.out.println(this.age);
        System.out.println(age);
        System.out.println(height);
//        System.out.println(weight);
    }
}
