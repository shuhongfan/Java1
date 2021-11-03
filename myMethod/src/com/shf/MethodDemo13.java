package com.shf;

public class MethodDemo13 {
    public static void main(String[] args) {
        System.out.println(fb(19));
    }
    public static int fb(int num){
        if(num==0||num==1) return 1;
        else return fb(num-1)+fb(num-2);
    }
}
