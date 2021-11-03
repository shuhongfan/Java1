package com.shf3;

import org.junit.Test;

import java.util.Locale;

public class StringMethodTest {
  @Test
  public void test4(){
    String str1="北京尚硅谷教育北京";
    String str2 = str1.replace("北", "东");
    System.out.println(str1);
    System.out.println(str2);

    String str3=str1.replace("北京","上海");
    System.out.println(str3);

    String str4="13world34hello566jaba56";
    String str5 = str4.replaceAll("\\d+", ",");
    System.out.println(str5);

    String str6="12345";
    boolean matches = str6.matches("\\d+");
    System.out.println(matches);
    String tel="0571-453428999";

    String str="hello|world|java";
    String[] split = str.split("\\|");
    System.out.println(split);
    for (int i = 0; i < split.length; i++) {
      System.out.print(split[i]);
    }
  }

  @Test
  public void test3(){
    String str1="helloworld";
    boolean b1 = str1.endsWith("rld");
    System.out.println(b1);
    boolean b2 = str1.startsWith("He");
    System.out.println(b2);
    boolean b3 = str1.startsWith("ll", 2);
    System.out.println(b3);


    String str2="wo";
    System.out.println(str1.contains(str2));

    int i1 = str1.indexOf("lo");
    System.out.println(i1);

    int i2 = str1.indexOf("lo", 5);
    System.out.println(i2);

    String str3="helloworld";
    int i3 = str1.lastIndexOf("lo");
    System.out.println(i3);
  }
  @Test
  public void test2(){
    String s1="HelloWorld";
    String s2="helloworld";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));

    String s3="abc";
    String s4=s3.concat("def");
    System.out.println(s4);

    String s5="abc";
    String s6=new String("abe");
    System.out.println(s5.compareTo(s6));

    String s7="北京天安门门票";
    String s8 = s7.substring(2,5);
    System.out.println(s8);
  }

  @Test
  public void test1(){
    String s1="HelloWorld";
    System.out.println(s1.length());
    System.out.println(s1.charAt(0));
//    System.out.println(s1.charAt(10));  //StringIndexOutOfBoundsException
    System.out.println(s1.isEmpty());

    String s2=s1.toLowerCase();
    System.out.println(s1);
    System.out.println(s2);

    String s3="    he  llo  w orl  d   ";
    String s4=s3.trim();
    System.out.println(s3);
    System.out.println(s4);
  }
}
