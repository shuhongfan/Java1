package com.shf;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("张三");
        s.setAge(30);
        System.out.println(s);
        System.out.println(s.toString());
    }
}
