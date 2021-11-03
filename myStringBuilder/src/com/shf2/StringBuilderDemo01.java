package com.shf2;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("hello");
        String s=sb.toString();
        System.out.println(s);

        String s2="hello";
        StringBuilder sb2=new StringBuilder(s2);
        System.out.println(sb2);
    }
}
