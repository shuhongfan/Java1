package com.shf2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
  public static void main(String[] args) throws IOException {
//    PrintWriter pw=new PrintWriter("myOtherStream\\pw.txt");

//    pw.write("hello\n");
//    pw.flush();
//    pw.write("world\n");
//    pw.flush();

//    pw.println("hello");
//    pw.flush();
//    pw.println("world");
//    pw.flush();


    PrintWriter pw=new PrintWriter(new FileWriter("myOtherStream\\pw.txt"),true);
    pw.println("hello");
    pw.println("world");


    pw.close();
  }
}
