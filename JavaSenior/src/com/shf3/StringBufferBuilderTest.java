package com.shf3;

import org.junit.Test;

/**
 * 都使用char型数组存储
 * String 不可改变的字符序列
 * StringBuffer 可变的字符序列；线程安全的，效率偏低
 * StringBuilder  可变的字符序列  线程不安全  效率高
 */
public class StringBufferBuilderTest {
  @Test
  public void test3(){
    long startTime=0L;
    long endTime=0L;
    String text="";
    StringBuffer buffer=new StringBuffer("");
    StringBuilder builder=new StringBuilder("");

    startTime=System.currentTimeMillis();
    for (int i = 0; i < 20000; i++) {
      buffer.append(i);
    }
    endTime=System.currentTimeMillis();
    System.out.println("stringbuffer的执行时间："+(endTime-startTime));

    startTime=System.currentTimeMillis();
    for (int i = 0; i < 20000; i++) {
      builder.append(i);
    }
    endTime=System.currentTimeMillis();
    System.out.println("StringBuilder的执行时间："+(endTime-startTime));

    startTime=System.currentTimeMillis();
    for (int i = 0; i < 20000; i++) {
      text=text+i;
    }
    endTime=System.currentTimeMillis();
    System.out.println("string的执行时间："+(endTime-startTime));
  }

  @Test
  public void test2(){
    StringBuffer s1=new StringBuffer("abc");
    s1.append(1);
    s1.append('2');
//    s1.delete(2,4);
    s1.replace(2,4,"hello");
    s1.insert(2,false);
//    s1.reverse();
    String s2 = s1.substring(1, 3);
    System.out.println(s2);

    System.out.println(s1);
    System.out.println(s1.length());
  }

  @Test
  public void test1(){
    StringBuffer sb1=new StringBuffer("abc");
    sb1.setCharAt(0,'m');
    System.out.println(sb1);

    StringBuffer sb2=new StringBuffer();
    System.out.println(sb2.length());
  }
}
