package com.shf17;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NewsTest {
  @Test
  public void test4(){
    String str="  sd  as  ".trim();
    String repeat = str.repeat(3);
    System.out.println(repeat);
  }

  @Test
  public void test3(){
    var num=10;
    var objects = new ArrayList<>();
    objects.add(1);
    objects.add("nbhjb");

    for (var o: objects) {
      System.out.println(o);
    }
  }

  @Test
  public void test2(){
    ClassLoader cl = this.getClass().getClassLoader();
    try (InputStream is = cl.getResourceAsStream("hello.txt");
         OutputStream os = new FileOutputStream("hello1.txt")) {
      is.transferTo(os); // 把输入流中的所有数据直接自动地复制到输出流中
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void test1(){
    List<Integer> list = List.of(1, 2, 3, 4, 5);
    System.out.println(list);
    list.add(1);
  }
}
