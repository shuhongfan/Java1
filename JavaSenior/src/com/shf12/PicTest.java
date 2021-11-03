package com.shf12;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class PicTest {
  @Test
  public void test2(){  //图片解密
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
      fis = new FileInputStream("2.png");
      fos = new FileOutputStream("4.png");

      byte[] buffer=new byte[20];
      int len;
      while ((len=fis.read(buffer))!=-1) {
        for (int i = 0; i < len; i++) {
          buffer[i]= (byte) (buffer[i] ^ 5);
        }
        fos.write(buffer,0,len);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fis!=null) fis.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (fos!=null) fos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  @Test
  public void test1(){  //图片加密
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
      fis = new FileInputStream("1.png");
      fos = new FileOutputStream("2.png");

      byte[] buffer=new byte[20];
      int len;
      while ((len=fis.read(buffer))!=-1) {
        for (int i = 0; i < len; i++) {
          buffer[i]= (byte) (buffer[i] ^ 5);
        }
        fos.write(buffer,0,len);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fis!=null) fis.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (fos!=null) fos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
