package com.shf;

public class StudentDemo {
    public static void main(String[] args) {
        Student.university="湖工"; //推荐使用类名调用

        Student s1=new Student();
        s1.name="林青霞";
        s1.age=30;
//        s1.university="湖工";
        s1.show();

        Student s2=new Student();
        s2.name="张三";
        s2.age=33;
//        s2.university="湖工";
        s2.show();
    }
}
