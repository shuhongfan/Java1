package com.shf3;

import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        int bigCount=0,smallCount=0,numberCount=0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if(c>='A'&&c<='Z') bigCount++;
            else if(c>='a'&&c<='z') smallCount++;
            else if(c>='0'&&c<='9') numberCount++;
        }
        System.out.println("大写字母："+bigCount);
        System.out.println("小写字母："+smallCount);
        System.out.println("数字："+numberCount);
    }
}
