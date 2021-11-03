package com.shf2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
  public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("myByteStream\\fos.txt");
    FileOutputStream fos=new FileOutputStream("myByteStream\\fos1.txt");

    int by;
    while((by=fis.read())!=-1) fos.write(by);
    fis.close();
    fos.close();
  }
}
