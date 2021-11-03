package com.shf13;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPTest2 {
  @Test
  public void client() throws IOException {
    Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9996);

    OutputStream os = socket.getOutputStream();

    FileInputStream fis = new FileInputStream(new File("1.png"));
    byte[] buffer=new byte[1024];
    int len;
    while ((len=fis.read(buffer))!=-1) os.write(buffer,0,len);

    fis.close();
    os.close();
    socket.close();
  }

  @Test
  public void server() throws IOException {
    ServerSocket ss = new ServerSocket(9996);

    Socket so = ss.accept();
    InputStream is = so.getInputStream();

    FileOutputStream fos = new FileOutputStream(new File("1.jpg"));
    byte[] buffer=new byte[1024];
    int len;
    while ((len=is.read(buffer))!=-1) fos.write(buffer,0,len);

    fos.close();
    is.close();
    so.close();
    ss.close();
  }
}
