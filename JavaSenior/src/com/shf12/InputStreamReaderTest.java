package com.shf12;

import org.junit.Test;

import java.io.*;

/**
 * 转换流  字节流与字符流之间转换
 * InputStreamReader  字节---》字符
 * OutputStreamWriter  字符---》字节
 */

public class InputStreamReaderTest {
  @Test
  public void test2(){
    InputStreamReader isr = null;
    OutputStreamWriter osw = null;
    try {
//      造文件
      File file = new File("hello.txt");
      File gbk = new File("hello_Gbk.txt");
//      造流
      FileInputStream fis = new FileInputStream(file);
      FileOutputStream fos = new FileOutputStream(gbk);
//      造转换流
      isr = new InputStreamReader(fis, "UTF-8");
      osw = new OutputStreamWriter(fos, "GBK");

      char[] cbuf=new char[5];
      int len;
      while ((len=isr.read(cbuf))!=-1) osw.write(cbuf,0,len);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (isr!=null) isr.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (osw!=null) osw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  @Test
  public void test1(){
    InputStreamReader isr = null;
    try {
      FileInputStream fis = new FileInputStream("hello.txt");
      isr = new InputStreamReader(fis,"UTF-8");
//      isr = new InputStreamReader(fis,"GBK");

      char[] cbuf=new char[5];
      int len;
      while ((len=isr.read(cbuf))!=-1) {
        String str = new String(cbuf, 0, len);
        System.out.println(str);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (isr!=null) isr.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
