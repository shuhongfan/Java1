package com.shf;

import java.io.File;

public class FileDemo03 {
  public static void main(String[] args) {
    File f=new File("C:\\Demo\\JAVA\\myFile\\src\\com\\shf\\java.txt");
    System.out.println(f.isDirectory());
    System.out.println(f.isFile());
    System.out.println(f.exists());

    System.out.println(f.getAbsolutePath());
    System.out.println(f.getPath());
    System.out.println(f.getName());

    File f2=new File("C:\\Demo\\JAVA\\myFile\\src\\com\\shf\\");
    String[] strArray = f2.list();
    for (String str : strArray) System.out.println(str);

    File[] fileArray = f2.listFiles();
    for (File file : fileArray) {
      if(file.isFile()) System.out.println(file);
    }
  }
}
