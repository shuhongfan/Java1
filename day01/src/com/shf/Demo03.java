package com.shf;

public class Demo03 {
  public static void main(String[] args) {
    boolean b1=false;
    int num1=10;
    if(b1&(num1++>0)) System.out.println("我现在在北京");
    else System.out.println("我现在在南京");
    System.out.println("num1:"+num1);

    boolean b2=false;
    int num2=10;
    if(b2&&(num2++>0)) System.out.println("我现在在北京");
    else System.out.println("我现在在南京");
    System.out.println("num2:"+num2);

    boolean b3=true;
    int num3=10;
    if(b3&(num3++>0)) System.out.println("我现在在北京");
    else System.out.println("我现在在南京");


    boolean x=true;
    boolean y=false;
    short z=42;
//    if(y==true)
      if((z++==42)&&(y=true)) z++;  //44
      if((x=false)||(++z==45)) z++;  //45
    System.out.println("z="+z);     // 46


    int i=21;
    i=-2;
    System.out.println(i<<2); // 每向左移一位，相当于 * 2
    System.out.println(i<<3); // 每向又移一位，相当于 / 2
    System.out.println(i<<27); // 每向又移一位，相当于 / 2

    System.out.println(8<<1);
    System.out.println(2<<3);

    int m=12;
    int n=5;
    System.out.println("m & n:"+(m&n));
    System.out.println("m | n:"+(m|n));
    System.out.println("m ^ n:"+(m^n));

    int a1=10;
    int a2=20;
    System.out.println("a1="+a1+",a2="+a2);

    int temp=a1;
    a1=a2;
    a2=temp;
    System.out.println("a1="+a1+",a2="+a2);

    a1=a1+a2;
    a2=a1-a2;
    a1=a1-a2;
    System.out.println("a1="+a1+",a2="+a2);

    a1=a1^a2;
    a2=a1^a2;
    a1=a1^a2;
    System.out.println("a1="+a1+",a2="+a2);
  }
}
