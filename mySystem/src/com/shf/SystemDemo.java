package com.shf;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("开始");

        System.out.println(System.currentTimeMillis()); // 当前时间的毫秒值
        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("共耗时："+(end-start));

        System.exit(0); // 终止当前运行的Java虚拟机
        System.out.println("结束");
    }
}
