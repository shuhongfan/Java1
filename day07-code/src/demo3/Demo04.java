package demo3;

import java.util.Random;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Random r=new Random();
        int randNum=r.nextInt(100)+1; // 1-100
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("输入：");
            int num=sc.nextInt();
            if(num>randNum) System.out.println("猜大了");
            else if(num<randNum) System.out.println("猜小了");
            else {
                System.out.println("猜对了!!!");
                break;
            }
        }
    }
}
