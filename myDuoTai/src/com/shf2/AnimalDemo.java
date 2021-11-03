package com.shf2;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        System.out.println(a.age); // 成员变量：编译看左边，执行看左边
//        System.out.println(a.weight);
        a.eat(); // 成员方法：编译看左边，执行看右边
        // 成员方法有重写，成员变量没有
//        a.playGame();
    }
}
