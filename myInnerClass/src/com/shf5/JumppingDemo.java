package com.shf5;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo=new JumppingOperator();

        Jumppig j=new Cat();
        j.jump();
        jo.method(j);

        Jumppig j2=new Dog();
        j2.jump();
        jo.method(j2);
        System.out.println("-----------------");

        jo.method(new Jumppig() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        });

        jo.method(new Jumppig() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });
    }
}
