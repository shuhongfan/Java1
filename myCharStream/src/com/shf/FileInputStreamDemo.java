package com.shf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileInputStreamDemo {
  public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("myCharStream\\a.txt");

    int by;
    while ((by = fis.read()) != -1) System.out.print((char)by);

    fis.close();


    String s="abc中国";
    byte[] bys = s.getBytes(StandardCharsets.UTF_8);
    System.out.println(Arrays.toString(bys));
  }
}
