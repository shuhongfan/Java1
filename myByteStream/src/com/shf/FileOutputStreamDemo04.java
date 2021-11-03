package com.shf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo04 {
  public static void main(String[] args) {
    FileOutputStream fos=null;
    try {
      fos=new FileOutputStream("myByteStream1\\fos.txt");
      fos.write("hello".getBytes(StandardCharsets.UTF_8));
    } catch (IOException e) {
      e.printStackTrace();
    } finally{
      if(fos!=null){
        try {
          fos.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
}
