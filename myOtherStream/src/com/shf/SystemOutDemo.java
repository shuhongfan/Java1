package com.shf;

import java.io.PrintStream;

public class SystemOutDemo {
  public static void main(String[] args) {
    PrintStream ps = System.out;

    ps.print("hello");
    ps.print(100);

    ps.println(100);
  }
}
