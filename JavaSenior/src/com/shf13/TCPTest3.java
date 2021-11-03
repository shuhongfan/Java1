package com.shf13;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPTest3 {
  @Test
  public void client() throws IOException {
    Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9996);

    OutputStream os = socket.getOutputStream();

    FileInputStream fis = new FileInputStream(new File("1.png"));
    byte[] buffer=new byte[1024];
    int len;
    while ((len=fis.read(buffer))!=-1) os.write(buffer,0,len);
//    关闭数据的输出
    socket.shutdownOutput();

    InputStream is = socket.getInputStream();
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    byte[] buffer1=new byte[20];
    int len1;
    while ((len1=is.read(buffer1))!=-1) baos.write(buffer1,0,len1);
    System.out.println(baos);

    fis.close();
    os.close();
    socket.close();
    baos.close();
  }

  @Test
  public void server() throws IOException {
    ServerSocket ss = new ServerSocket(9996);

    Socket socket = ss.accept();
    InputStream is = socket.getInputStream();

    FileOutputStream fos = new FileOutputStream(new File("1.jpg"));
    byte[] buffer=new byte[1024];
    int len;
    while ((len=is.read(buffer))!=-1) fos.write(buffer,0,len);
    System.out.println("图片传输完成");

//    服务器给与客户端反馈
    OutputStream os = socket.getOutputStream();
    os.write("你好，代码截图已收到".getBytes(StandardCharsets.UTF_8));


    fos.close();
    is.close();
    socket.close();
    ss.close();
    os.close();
  }
}
