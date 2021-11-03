package com.shf;

public class MethodDemo11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
//            要么个位是7，要么十位是7，要么能够被7整除
            if(i%10==7 || i/10%10==7 || i%7==0)
                System.out.println(i);
        }
    }
}
