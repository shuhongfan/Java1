package com.shf4;

public class Outer {

    public void method(){

        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

        Inter i = new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();
        i.show();
        i.show();
        i.show();
    }
}
