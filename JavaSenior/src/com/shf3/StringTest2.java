package com.shf3;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringTest2 {
  @Test
  public void test4(){
    String s1="javaEEhadoop";
    String s2="JavaEE";
    String s3=s2+"hadoop";  // 有变量参与，存储在栈里
    System.out.println(s1==s3);

    final String s4="javaEE"; // final修饰的变量就是常量，存储在常量池
    String s5=s4+"hadoop";
    System.out.println(s1==s5);
  }
  @Test
  public void test3() throws Exception{
//    string-----byte[]
    String str1="abc123中国";
    byte[] bytes = str1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = str1.getBytes("gbk");
    System.out.println(Arrays.toString(bytes));
    System.out.println(Arrays.toString(bytes1));

    String str2 = new String(bytes);
    System.out.println(str2);
    String str3 = new String(bytes1,"gbk");
    System.out.println(str3);
  }

  @Test
  public void test2(){
//    String------char[]    toCharArray()
    String str1="abc123";
    char[] charArray=str1.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      System.out.print(charArray[i]);
    }

//    char[] -------String  调用String的构造器
    char[] arr=new char[]{'h','e','l','l','o'};
    String str2 = new String(arr);
  }

  @Test
  public void test1(){
    String str1="123";
    int num=Integer.parseInt(str1);
    System.out.println(num);

    String str2 = String.valueOf(num);
    String str3 = num+"";  // 有变量参与 都在栈里
    System.out.println(str1==str3);
  }
}
