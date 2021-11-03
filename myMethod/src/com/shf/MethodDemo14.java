package com.shf;

public class MethodDemo14 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 33; j++) {
                int z=100-i-j;
                if(z%3==0 && 5*i+3*j+z/3==100)
                    System.out.println(i+","+j+","+z);
            }
        }
    }
}
