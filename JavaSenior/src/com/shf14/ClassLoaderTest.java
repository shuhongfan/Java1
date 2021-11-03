package com.shf14;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderTest {
  @Test
  public void test2() throws IOException {
    Properties pros = new Properties();

//    当前module下
    FileInputStream fis = new FileInputStream("src\\jdbc.properties");
    pros.load(fis);

//    当前module的src下
//    ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
//    InputStream is = classLoader.getResourceAsStream("jdbc.properties");
//    pros.load(is);

    String user = pros.getProperty("user");
    String password = pros.getProperty("password");
    System.out.println("User="+user+",password="+password);
  }

  @Test
  public void test1() {
//    对于自定义类，使用系统类加载器进行加载
    ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
    System.out.println(classLoader);

//    调用系统类加载的getparent  获取扩展类加载器
    ClassLoader classLoader1 = classLoader.getParent();
    System.out.println(classLoader1);

//    无法获取引导类加载器
    ClassLoader classLoader2 = classLoader1.getParent();
    System.out.println(classLoader2);
  }
}
