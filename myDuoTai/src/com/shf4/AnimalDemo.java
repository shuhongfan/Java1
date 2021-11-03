package com.shf4;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();  //向上转型
        a.eat();
//        a.playGame();

       /* Cat c=new Cat();
        c.eat();
        c.playGame();*/

        Cat c=(Cat) a; // 向下转型
        c.eat();
        c.playGame();
    }
}
