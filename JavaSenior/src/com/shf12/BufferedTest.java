package com.shf12;

import org.junit.Test;

import java.io.*;

public class BufferedTest {
  @Test
  public void testBufferedReaderBufferedWriter(){
    BufferedReader br = null;
    BufferedWriter bw = null;
    try {
      br = new BufferedReader(new FileReader(new File("hello.txt")));
      bw = new BufferedWriter(new FileWriter(new File("hello2.txt")));

//      方式1
//      char[] cbuf=new char[10];
//      int len;
//      while ((len=br.read(cbuf))!=-1) bw.write(cbuf,0,len);

//      方式2
      String data;
      while ((data=br.readLine())!=null) {
//        bw.write(data+"\n");
//        或
        bw.write(data);
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br!=null) br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (bw!=null) bw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  @Test
  public void testCopyFileWithBuffered(){
    long start = System.currentTimeMillis();
    copyFileWithBuffered("1.png","3.png");
    long end = System.currentTimeMillis();
    System.out.println("复制操作花费的时间为："+(end-start));
  }
  public void copyFileWithBuffered(String srcPath,String destPath){
    FileInputStream fis = null;
    FileOutputStream fos = null;
    BufferedInputStream bis = null;
    BufferedOutputStream bos = null;
    try {
//      制造文件
      File srcFile = new File(srcPath);
      File destFile = new File(destPath);

//    制造节点流
      fis = new FileInputStream(srcFile);
      fos = new FileOutputStream(destFile);

//    制造缓冲流
      bis = new BufferedInputStream(fis);
      bos = new BufferedOutputStream(fos);

      byte[] buffer=new byte[10];
      int len;
      while ((len=bis.read(buffer))!=-1) bos.write(buffer,0,len);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (bis!=null) bis.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (bos!=null) bos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  @Test
  public void test1(){
    FileInputStream fis = null;
    FileOutputStream fos = null;
    BufferedInputStream bis = null;
    BufferedOutputStream bos = null;
    try {
      File srcFile = new File("1.jpg");
      File destFile = new File("2.png");

//    制造节点流
      fis = new FileInputStream(srcFile);
      fos = new FileOutputStream(destFile);

//    制造缓冲流
      bis = new BufferedInputStream(fis);
      bos = new BufferedOutputStream(fos);

      byte[] buffer=new byte[10];
      int len;
      while ((len=bis.read(buffer))!=-1) bos.write(buffer,0,len);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (bis!=null) bis.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (bos!=null) bos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
//      fis.close();
//      fos.close();
    }
  }
}
