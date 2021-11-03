package com.shf3;

import java.io.*;

public class CopyJavaDemo01 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr=new InputStreamReader(new FileInputStream("myCharStream\\myCharStream.iml"));
    OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("myCharStream\\copy1.iml"));

//    int ch;
//    while ((ch=isr.read())!=-1) osw.write(ch);

    char[] chs=new char[1024];
    int len;
    while((len=isr.read(chs))!=-1) osw.write(chs,0,len);

    osw.close();
    isr.close();
  }
}
