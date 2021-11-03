package com.shf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamdemo02 {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos=new FileOutputStream("myByteStream\\fos.txt");

//    File file=new File("myByteStream\\fos.txt");
//    FileOutputStream fos2=new FileOutputStream(file);

    fos.write(97);
    fos.write(98);
    fos.write(99);
    fos.write(100);
    fos.write(101);

//    byte[] bys={97,98,99,100,101};
    byte[] bys = "abcde".getBytes(StandardCharsets.UTF_8);
//    fos.write(bys);

    fos.write(bys,1,3);
    fos.close();
  }
}
