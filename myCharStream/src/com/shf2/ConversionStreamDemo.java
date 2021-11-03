package com.shf2;

import java.io.*;

public class ConversionStreamDemo {
  public static void main(String[] args) throws IOException {
//    FileOutputStream fos=new FileOutputStream("myCharStream\\osw.txt");
//    OutputStreamWriter ows=new OutputStreamWriter(fos);

    OutputStreamWriter ows=new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"),"GBK");
    InputStreamReader isr=new InputStreamReader(new FileInputStream("myCharStream\\osw.txt"),"GBK");

    ows.write("中国");

    int ch;
    while ((ch = isr.read()) != -1) System.out.println((char) ch);

    isr.close();
    ows.close();
  }
}
