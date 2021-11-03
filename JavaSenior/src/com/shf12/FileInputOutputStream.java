package com.shf12;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
  @Test
  public void testCopyFile(){
    long start = System.currentTimeMillis();
    copyFile("1.png","3.png");
    long end = System.currentTimeMillis();
    System.out.println("复制操作花费的时间为："+(end-start));
  }
  public static void copyFile(String srcPath,String destPath){
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
      File file = new File(srcPath);
      File destFile = new File(destPath);
      fis = new FileInputStream(file);
      fos = new FileOutputStream(destFile);

      byte[] buffer=new byte[10];
      int len;
      while ((len=fis.read(buffer))!=-1) fos.write(buffer,0,len);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fis!=null) fis.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (fos!=null)fos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  @Test
  public void test2(){  //复制图片
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
      File file = new File("1.png");
      File destFile = new File("2.png");
      fis = new FileInputStream(file);
      fos = new FileOutputStream(destFile);

      byte[] buffer=new byte[5];
      int len;
      while ((len=fis.read(buffer))!=-1) fos.write(buffer,0,len);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fis!=null) fis.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (fos!=null)fos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  @Test
  public void test1() {
    FileInputStream fis = null;
    try {
      File file = new File("hello.txt");
      fis = new FileInputStream(file);
      byte[] buffer=new byte[5];
      int len;
      while ((len=fis.read(buffer))!=-1) {
        String str = new String(buffer, 0, len);
        System.out.println(str);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fis!=null) fis.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
