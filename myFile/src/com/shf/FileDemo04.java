package com.shf;

import java.io.File;
import java.io.IOException;

public class FileDemo04 {
  public static void main(String[] args) throws IOException {
    File f1=new File("myFile//j.txt");
    System.out.println(f1.createNewFile());

    System.out.println(f1.delete());

    File f2=new File("myFile\\itcase");
    System.out.println(f2.mkdir());
    System.out.println(f2.delete());

    File f3=new File("myFile\\itcast");
    System.out.println(f3.mkdir());
    File f4=new File("myFile\\itcast\\java.txt");
    System.out.println(f4.createNewFile());

    System.out.println(f4.delete());
    System.out.println(f3.delete());
  }
}
