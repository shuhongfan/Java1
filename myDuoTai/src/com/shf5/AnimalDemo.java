package com.shf5;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a=new Cat("HH",6);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
