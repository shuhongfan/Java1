package com.shf12;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class RandomAccessFileTest {
  @Test
  public void test3() throws IOException {  // 插入数据
    RandomAccessFile raf = new RandomAccessFile(new File("h.txt"), "rw");
    raf.seek(3);

    StringBuilder builder = new StringBuilder((int) raf.length());
    byte[] buffer=new byte[20];
    int len;
    while ((len=raf.read(buffer))!=-1) builder.append(new String(buffer,0,len));

    raf.seek(3);
    raf.write("XYX".getBytes(StandardCharsets.UTF_8));
    raf.write(builder.toString().getBytes(StandardCharsets.UTF_8));

    raf.close();
  }
  @Test
  public void test2() throws IOException {
    RandomAccessFile raf = new RandomAccessFile(new File("h.txt"), "rw");
//    raf.seek(raf.length());  // 将指针跳到第3个位置
    raf.seek(3);  // 将指针跳到第3个位置
    raf.write("XYX".getBytes(StandardCharsets.UTF_8));
    raf.close();
  }
  @Test
  public void test1(){
    RandomAccessFile raf = null;
    RandomAccessFile raf1 = null;
    try {
      raf = new RandomAccessFile(new File("1.png"), "r");
      raf1 = new RandomAccessFile(new File("2.png"), "rw");

      byte[] buffer=new byte[1024];
      int len;
      while ((len=raf.read(buffer))!=-1) raf1.write(buffer,0,len);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (raf!=null) raf.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (raf1!=null) raf1.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
