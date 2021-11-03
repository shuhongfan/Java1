package com.shf;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("--------------");

        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));
        System.out.println("--------------");

        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.56));
        System.out.println("--------------");

        System.out.println(Math.round(12.34)); //四舍五入
        System.out.println(Math.round(12.56));
        System.out.println("--------------");

        System.out.println(Math.max(66,88));
        System.out.println("--------------");

        System.out.println(Math.min(66,88));
        System.out.println("--------------");

        System.out.println(Math.pow(2,3));
        System.out.println("--------------");

        System.out.println(Math.random());  // [0.0,1.0)
        System.out.println((int)(Math.random()*100)+1);
        System.out.println("--------------");

    }
}
