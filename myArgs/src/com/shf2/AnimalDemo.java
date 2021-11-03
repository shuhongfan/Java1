package com.shf2;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao=new AnimalOperator();
//        Animal a=new Cat(); // 多态
        Animal a = ao.getAnimal();
        ao.useAnimal(a);
        a.eat();
    }
}
