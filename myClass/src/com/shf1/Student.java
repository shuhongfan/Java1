package com.shf1;

public class Student {
    String name;
    private int age;

    public void show() {
        System.out.println(name + ", " + age);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        if (a > 120 || a < 0) System.out.println("年龄有误");
        else this.age = a;
    }
}
