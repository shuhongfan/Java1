package com.shf;

import java.io.File;

public class FileDemo01 {
  public static void main(String[] args) {
    File f1=new File("C:\\Demo\\JAVA");
    System.out.println(f1);

    File f2=new File("C:\\Demo\\JAVA","java.txt");
    System.out.println(f2);

    File f3=new File("C:\\Demo\\JAVA");
    File f4=new File("java.txt");
    System.out.println(f4);
  }
}
