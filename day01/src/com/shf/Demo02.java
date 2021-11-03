package com.shf;

public class Demo02 {
  public static void main(String[] args) {
    int num1=12;
    int num2=5;
    int result1=num1/num2;
    System.out.println(result1);

    int result2=num1/num2*num2;
    System.out.println(result2);

    double result3=num1*1.0/num2;
    System.out.println(result3);

    int num=187;
    int bai=num/100;
    int shi=num/10%10;
//    int shi=num%100/10;
    int ge=num%10;
    System.out.println(num+"百位为："+bai+"十位为："+shi+"个位为："+ge);

    short s1=10;
//    s1=s1+1;
    s1+=2;
    System.out.println(s1);

    int i=1;
    i*=0.1;
    System.out.println(i);
    i++;
    System.out.println(i);

    int n=10;
    n += (n++)+(++n);  // n =n + (n++) + (++n);
    System.out.println(n);
  }
}
