package demo3;

import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 100; i++) {
            int num=5;
            int result=r.nextInt(num)+1; // 0-n-1
            System.out.println(result);
        }
    }
}
