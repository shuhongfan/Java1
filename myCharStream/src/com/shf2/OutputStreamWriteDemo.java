package com.shf2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriteDemo {
  public static void main(String[] args) throws IOException {
    OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"));

//    osw.write(97);
//    osw.write(100);
//    osw.write(98);
//    osw.flush();

    char[] chs={'a','b','c','d','e'};
//    osw.write(chs);

//    osw.write(chs,0,chs.length);
    osw.write(chs,1,3);

    osw.write("abcde");

    osw.write("abcde",0,"abcde".length());

    osw.close();
  }
}
