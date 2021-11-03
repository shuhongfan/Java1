package com.shf13;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPTest1 {
  @Test
  public void client() {
    Socket socket = null;
    OutputStream os = null;
    try {
      InetAddress inet = InetAddress.getByName("127.0.0.1");
      socket = new Socket(inet, 8899);

      os = socket.getOutputStream();
      os.write("你好，我是客户端mm".getBytes(StandardCharsets.UTF_8));
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (os!=null) os.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (socket!=null) socket.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  @Test
  public void server(){
    ServerSocket ss = null;
    Socket socket = null;
    InputStream is = null;
    ByteArrayOutputStream baos = null;
    try {
      ss = new ServerSocket(8899);
      socket = ss.accept();

      is = socket.getInputStream();

//    不建议 可能会有乱码
//    byte[] buffer=new byte[20];
//    int len;
//    while ((len=is.read(buffer))!=-1){
//      String str = new String(buffer, 0, len);
//      System.out.println(str);
//    }

      baos = new ByteArrayOutputStream();
      byte[] buffer=new byte[5];
      int len;
      while ((len=is.read(buffer))!=-1) baos.write(buffer,0,len);

      System.out.println(baos.toString());

      System.out.println("收到了来自于："+socket.getInetAddress().getHostAddress()+"的数据");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (baos!=null) baos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (is!=null) is.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (socket!=null) socket.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (ss!=null) ss.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
