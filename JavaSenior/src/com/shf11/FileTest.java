package com.shf11;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
  public static int size=0;

  @Test
  public void test10() throws IOException {
    File file = new File("D:\\DEMO\\JAVA\\JavaSenior\\h.txt");
    File file1 = new File(file.getParent(),"b.txt");
    if (!file1.exists()) file1.createNewFile();
  }

  @Test
  public void test9(){
    File file=new File("D:\\DEMO\\JAVA\\JavaSenior");
    printSubFile(file);
    System.out.println("占用空间大小："+size);
  }
  public static void printSubFile(File dir){
    File[] files = dir.listFiles();
    for (File f: files) {
        if (f.isDirectory()) printSubFile(f);
        else {
          System.out.println(f.getAbsolutePath());
          size+=f.length();
        }
    }
  }
  public static void print(File dir){
    File[] files = dir.listFiles();
    for (File f: files) {
      if (f.isDirectory()) print(f);
      else System.out.println(f.getAbsolutePath());
    }
  }

  @Test
  public void test8(){
    File file = new File("D:\\DEMO\\JAVA\\JavaSenior");
    String[] files = file.list();
    for (String f: files) {
      if (f.endsWith("txt")) System.out.println(f);
    }
  }

  @Test
  public void test7() throws IOException {
    File file = new File("D:\\DEMO\\JAVA\\JavaSenior\\io\\io1\\hello.txt");
    File file1=new File(file.getParent(),"haha.txt");
    boolean newFile = file1.createNewFile();
    if (newFile) System.out.println("创建文件成功");
  }

  @Test
  public void test6(){
    File file1 = new File("D:\\DEMO\\JAVA\\JavaSenior\\io\\io1\\io2");
    boolean mkdirs = file1.mkdirs();
    if (mkdirs) System.out.println("创建成功");
  }

  @Test
  public void test5() throws IOException {
    File file1=new File("hi.txt");
    if (!file1.exists()){
      file1.createNewFile();
      System.out.println("创建成功");
    } else {
      file1.delete();
      System.out.println("删除成功");
    }
  }

  @Test
  public void test4(){
    File file1 = new File("h.txt");
    System.out.println(file1.isDirectory());
    System.out.println(file1.isFile());
    System.out.println(file1.exists());
    System.out.println(file1.canRead());
    System.out.println(file1.canWrite());
    System.out.println(file1.isHidden());
    System.out.println("**************************");

    File file2 = new File("D:");
    System.out.println(file2.isDirectory());
    System.out.println(file2.isFile());
    System.out.println(file2.exists());
    System.out.println(file2.canRead());
    System.out.println(file2.canWrite());
    System.out.println(file2.isHidden());


  }

  @Test
  public void test3(){
    File file1 = new File("hello.txt");
    File file2 = new File("h.txt");

    boolean renameTo = file1.renameTo(file2);
    System.out.println(renameTo);
  }

  @Test
  public void test2(){
    File file = new File("D:\\DEMO\\JAVA\\JavaSenior");
    String[] list = file.list();
    for (String s: list) {
      System.out.println(s);
    }
    System.out.println("**********");

    File[] files = file.listFiles();
    for (File f: files) {
      System.out.println(f);
    }
  }

  @Test
  public void test1(){
    File file1 = new File("hello.txt");
    System.out.println(file1);

    File file2 = new File("D:\\DEMO\\JAVA", "JavaSenior");
    System.out.println(file2);

    File file3 = new File(file2, "hello.txt");
    System.out.println(file3);

    System.out.println(file1.getAbsoluteFile());
    System.out.println(file1.getPath());
    System.out.println(file1.getName());
    System.out.println(file1.getParent());
    System.out.println(file1.length());
    System.out.println(file1.lastModified());
    System.out.println("*************************");

    System.out.println(file3.getAbsoluteFile());
    System.out.println(file3.getPath());
    System.out.println(file3.getName());
    System.out.println(file3.getParent());
    System.out.println(file3.length());
    System.out.println(file3.lastModified());
    System.out.println("*************************");
  }
}
