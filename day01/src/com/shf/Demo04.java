package com.shf;

public class Demo04 {
  public static void main(String[] args) {
    boolean x=true;
    boolean y=false;
    short z=40;

    if((z++==40)&&(y=true)) z++;
    if((x=false)||(++z==43)) z++;

    System.out.println("z="+z);

    int num1=10,num2=21,num3=-21;
//    int max=num1;
//    if(num2>max) max=num2;
//    else if(num3>max) max=num3;
    int max=(((num1>num2)?num1:num2)>num3)?((num1>num2)?num1:num2):num3;
    System.out.println("max="+max);

    double d1=12.3;
    double d2=32.1;
    if(d1>10.0 && d2<20.0) System.out.println(d1+d2);
    else System.out.println(d1*d2);

    String s1="北京";
    String s2="武汉";
    String temp;
    temp=s1;
    s1=s2;
    s2=temp;
    System.out.println("s1="+s1+"s2="+s2);

    String str1=Integer.toBinaryString(60);
    String str2=Integer.toHexString(60);
    System.out.println(str1);
    System.out.println(str2);

    int i1=60;
    int i2=i1&15;
    String j=(i2>9)?(char)(i2-10+'a')+"":i2+"";
//    System.out.println(j);
    int temp1=i1>>>4;
    i2=temp1&15;
    String k=(i2>9)?(char)(i2-10+'a')+"":i2+"";
    System.out.println(k+j);
  }
}
