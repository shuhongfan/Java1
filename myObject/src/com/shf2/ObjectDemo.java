package com.shf2;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(30);

        Student s2=new Student();
        s2.setName("张三");
        s2.setAge(30);

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
