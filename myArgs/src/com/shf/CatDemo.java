package com.shf;

public class CatDemo {
    public static void main(String[] args) {
        CatOperator co=new CatOperator();
//        Cat c=new Cat();
        Cat c= co.getCat();
        co.useCat(c);
    }
}
