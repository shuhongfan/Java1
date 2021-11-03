package com.shf3;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a=new Cat("假按揭",10);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a=new Dog("sda",55);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
