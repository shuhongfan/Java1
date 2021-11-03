package com.shf2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgDemo {
  public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("myByteStream\\fos.png");
    FileOutputStream fos=new FileOutputStream("myByteStream\\fos2.png");

    byte[] bys=new byte[1024];
    int len;
    while ((len=fis.read(bys))!=-1) fos.write(bys,0,len);

    fos.close();
    fis.close();
  }
}
