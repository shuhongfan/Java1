package com.shf;

public class Student {
    public String name;
    public int age;
//    public String university;
    public static String university; // 静态修饰

    public void show(){
        System.out.println(name+", "+age+", "+university);
    }
}
