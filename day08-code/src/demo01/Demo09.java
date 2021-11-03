package demo01;

import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input=sc.next();
        int countUpper=0,countLower=0,countNumber=0,countOther=0;
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
            if(ch>='A'&&ch<='Z') countUpper++;
            else if(ch>='a'&&ch<='z') countLower++;
            else if(ch>='0'&&ch<='z') countNumber++;
            else countOther++;
        }
        System.out.println("大写："+countUpper);
        System.out.println("小写："+countLower);
        System.out.println("数字："+countNumber);
        System.out.println("其他："+countOther);
    }
}
