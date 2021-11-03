package com.shf12;

import org.junit.Test;

import java.io.*;

/**
 * 抽象基类        节点流               缓冲流
 * InputStream    FileInputStream     BufferedInputStream
 *OutPutStream    FileOutputStream    BufferedOutputStream
 * Reader         FileReader          BufferedReadr
 * Writer         FileWriter          BufferedWriter
 */
public class FileReaderWriterTest {
  @Test
  public void test4() {  // 复制文件
    FileReader fr = null;
    FileWriter fw = null;
    try {
      File srcFile = new File("hello.txt");
      File destFile = new File("hello2.txt");
      fr = new FileReader(srcFile);
      fw = new FileWriter(destFile);

      char[] cbuf=new char[5];
      int len; // 记录每次读入cbuf数组中字符的个数
      while ((len=fr.read(cbuf))!=-1) fw.write(cbuf,0,len); // 每次写出len个字符
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fr!=null) fr.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (fw!=null) fw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  @Test
  public void test3() throws IOException {
    File file = new File("hello.txt");
    FileWriter fw = new FileWriter(file);
    fw.write("I have a dream~\n");
    fw.write("you need to have a dream!");

    fw.close();
  }

  @Test
  public void test2() {
    FileReader fr = null;
    try {
      File file = new File("h.txt");
      fr = new FileReader(file);
//    返回每次读入cbuf数组中的字符的个数
      char [] cbuf=new char[5];
      int len;
      while ((len = fr.read(cbuf))!=-1){
//        for (int i = 0; i < len; i++) {
//          System.out.print(cbuf[i]);
//        }
        String s = new String(cbuf,0,len);
        System.out.println(s);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fr!=null)
        fr.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

  @Test
  public void test1() {
    FileReader fr = null;
    try {
      File file = new File("h2.txt");   //FileNotFoundException
//    提供具体的流
      fr = new FileReader(file);
//    数据的读入
//    int data = fr.read();
//    while (data!=-1) {
//      System.out.print((char) data);
//      data=fr.read();
//    }
      int data;
      while ((data = fr.read()) != -1) System.out.println((char) data);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      //    关闭流
      try {
        if (fr!=null)
        fr.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
