package com.shf3;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferStreamDemo {
  public static void main(String[] args) throws IOException {
//    BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("myByteStream\\bos.txt"));
    BufferedInputStream bis=new BufferedInputStream(new FileInputStream("myByteStream\\bos.txt"));

//    bos.write("hello\r\n".getBytes(StandardCharsets.UTF_8));
//    bos.write("world\r\n".getBytes(StandardCharsets.UTF_8));

    int by;
    while ((by = bis.read()) != -1) System.out.println((char)by);

    byte[] bys=new byte[1024];
    int len;
    while ((len = bis.read(bys)) != -1) System.out.println(new String(bys,0,len));

//    bos.close();
    bis.close();
  }
}
