package com.shf9;

public class StudentDemo{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("李四");
        s1.setAge(22);
        System.out.println(s1.getName()+", "+s1.getAge());
        s1.study();
    }
}
