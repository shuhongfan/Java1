package com.shf3;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo=new JumppingOperator();
//        Jumpping j=new Cat();
        Jumpping j= jo.getJumpping();
        jo.useJumpping(j);
    }
}
