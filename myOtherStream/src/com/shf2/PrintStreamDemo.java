package com.shf2;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
  public static void main(String[] args) throws IOException {
    PrintStream ps=new PrintStream("myOtherStream\\ps.txt");

//    ps.write(97);
    ps.println(97);
    ps.println(98);

    ps.close();
  }
}
