package com.shf;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(20));
        System.out.println(isEvenNumber(21));
    }
    public static boolean isEvenNumber(int num){
        if(num%2==0) return true;
        else return false;
    }
}
