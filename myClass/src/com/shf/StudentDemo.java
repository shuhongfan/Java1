package com.shf;

public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.name+", "+s.age);
        s.name="张三";
        s.age=100;
        System.out.println(s.name+", "+s.age);
        s.study();
        s.doHomeWord();
    }
}
