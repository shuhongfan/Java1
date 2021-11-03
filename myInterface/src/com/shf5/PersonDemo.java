package com.shf5;

public class PersonDemo {
    public static void main(String[] args) {
        PingpangPlayer ppp=new PingpangPlayer();
        ppp.setName("张三");
        ppp.setAge(30);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();

        BasketballPlayer bp=new BasketballPlayer();
        bp.setAge(100);
        bp.setName("李四");
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
    }
}
