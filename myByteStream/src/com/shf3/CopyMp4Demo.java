package com.shf3;

import java.io.*;

public class CopyMp4Demo {
  public static void main(String[] args) throws IOException {
    long startTime=System.currentTimeMillis();

    method4();

    long endTime=System.currentTimeMillis();
    System.out.println("共耗时："+(endTime-startTime)+"毫秒");
  }

//  字节缓冲流一次读写一个字节数组
  public static void method4() throws IOException {
    BufferedInputStream bis=new BufferedInputStream(new FileInputStream("myByteStream\\fos.mp4"));
    BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("myByteStream\\fos4.mp4"));

    byte[] bys=new byte[1024];
    int len;
    while((len=bis.read(bys))!=-1) bos.write(bys,0,len);

    bos.close();
  }

//  字节缓冲流一次读写一个字节
  public static void method3() throws IOException {
    BufferedInputStream bis=new BufferedInputStream(new FileInputStream("myByteStream\\fos.mp4"));
    BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("myByteStream\\fos3.mp4"));

    int by;
    while((by=bis.read())!=-1) bos.write(by);

    bos.close();
  }

//  基本字节流一次读写以恶搞字节数组
  public static void method2() throws IOException {
    FileInputStream fis=new FileInputStream("myByteStream\\fos.mp4");
    FileOutputStream fos=new FileOutputStream("myByteStream\\fos2.mp4");

    byte[] bys=new byte[1024];
    int len;
    while((len=fis.read(bys))!=-1) fos.write(bys,0,len);

    fos.close();
    fis.close();
  }

//  基本字节流一次读写一个字节
  public static void method1() throws IOException {
    FileInputStream fis=new FileInputStream("myByteStream\\fos.mp4");
    FileOutputStream fos=new FileOutputStream("myByteStream\\fos1.mp4");

    int by;
    while((by=fis.read())!=-1) fos.write(by);

    fos.close();
    fis.close();
  }
}
