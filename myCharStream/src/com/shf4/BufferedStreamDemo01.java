package com.shf4;

import java.io.*;

public class BufferedStreamDemo01 {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw=new BufferedWriter(new FileWriter("myCharStream\\bw.txt"));
    bw.write("hello\t");
    bw.write("world\r\n");
    bw.close();

    BufferedReader br=new BufferedReader(new FileReader("myCharStream\\bw.txt"));

//    int ch;
//    while ((ch = br.read()) != -1) System.out.print((char) ch);

    char[] chs=new char[1024];
    int len;
    while ((len = br.read()) != -1) System.out.println(new String(chs,0,len));

    br.close();
  }
}
