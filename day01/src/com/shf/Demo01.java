package com.shf;
/*
* 基本数据类型
*     整型： byte 、short、int、long
*     浮点型： float、double
*     字符型： char
*     布尔型： boolean
*
* 引用数据类型
*     类： class
*     接口：interface
*     数组：array
*
*
*     byte、char、short --> int --> long --> float --> double
*
* */

public class Demo01 {
  int myClass=1;

  public static void main(String[] args) {
    byte b1=-128;
    System.out.println(b1);

    long l1=12345678910L;
    System.out.println(l1);

    double d1=123.3;
    System.out.println(d1);

    float f1=12.3f;
    System.out.println(f1);

    char c1='\n';
    System.out.println("hello"+c1);
    System.out.println("world");

    char c2='\u0043';
    System.out.println(c2);

    double d2=12.9;
    int i1=(int)d2;
    System.out.println(i1);

    int i2=128;
    byte b=(byte) i2;
    System.out.println(b);

    int num1=0b110;
    int num2=110;
    int num3=0127;
    int num4=0x110A;

    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
  }
}

class IdentifierTest{
  public static void main(String[] args){

    int myNumber=1010;
//    int 学号=10003;
//    System.out.println(学号);
    System.out.println(myNumber);

//    System.out.println(myClass);
  }
}

