package com.shf3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaDemo02 {
  public static void main(String[] args) throws IOException {
    FileReader fr=new FileReader("myCharStream\\myCharStream.iml");
    FileWriter fw=new FileWriter("myCharStream\\copy3.iml");

//    int ch;
//    while((ch=fr.read())!=-1) fw.write(ch);

    char[] chs=new char[1024];
    int len;
    while ((len = fr.read(chs))!=-1) fw.write(chs,0,len);
    fw.close();
  }
}
