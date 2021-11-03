package com.shf2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo03 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("myByteStream\\fos.txt");

    byte[] bys=new byte[5];

    int len=fis.read(bys);
    System.out.println(len);
    System.out.println(new String(bys,0,len));

    len=fis.read(bys);
    System.out.println(len);
    System.out.println(new String(bys,0,len));

    len=fis.read(bys);
    System.out.println(len);
    System.out.println(new String(bys,0,len));

    fis.close();
  }
}
