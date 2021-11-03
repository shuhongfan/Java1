package com.shf4;

public class Student {
    //    成员变量
    private String name;
    private int age;

    //    构造方法
    public Student() {
    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    //    成员方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
