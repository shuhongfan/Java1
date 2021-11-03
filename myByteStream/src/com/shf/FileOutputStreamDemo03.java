package com.shf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo03 {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos=new FileOutputStream("myByteStream\\fos.txt",true);

    for(int i=0;i<10;i++){
      fos.write("hello".getBytes(StandardCharsets.UTF_8));
      fos.write("\n".getBytes(StandardCharsets.UTF_8));
    }

    fos.close();
  }
}
