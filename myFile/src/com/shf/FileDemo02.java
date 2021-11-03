package com.shf;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
  public static void main(String[] args) {
    File f1=new File("C:\\Demo\\JAVA\\myFile\\src\\com\\shf\\java.txt");
    try {
      System.out.println(f1.createNewFile());
    } catch (IOException e) {
      e.printStackTrace();
    }

    File f2=new File("C:\\Demo\\JAVA\\myFile\\src\\com\\shf\\1");
    System.out.println(f2.mkdir());

    File f3=new File("C:\\Demo\\JAVA\\myFile\\src\\com\\shf\\2\\3");
    System.out.println(f3.mkdirs());

    File f4=new File("C:\\Demo\\JAVA\\myFile\\src\\com\\shf\\javaa.txt");
    try {
      System.out.println(f4.createNewFile());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
