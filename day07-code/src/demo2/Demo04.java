package demo2;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        int num=new Scanner(System.in).nextInt();
//        System.out.println("输入的是："+num);

//        method(new Scanner(System.in));

        Scanner sc=method1();
        int num=sc.nextInt();
        System.out.println(num);
    }
    public static void method(Scanner sc){
        int i = sc.nextInt();
        System.out.println("输入的是："+i);
    }
    public static Scanner method1(){
//        Scanner sc=new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
