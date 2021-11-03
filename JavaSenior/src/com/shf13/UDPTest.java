package com.shf13;

import org.junit.Test;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDPTest {
  @Test
  public void sender() throws IOException {
    DatagramSocket socket = new DatagramSocket();

    String str="我是UDP方式发送的导弹";
    byte[] data=str.getBytes(StandardCharsets.UTF_8);
    InetAddress localHost = InetAddress.getLocalHost();
    DatagramPacket packet = new DatagramPacket(data,0,data.length,localHost,9999);

    socket.send(packet);

    socket.close();
  }

  @Test
  public void receiver() throws IOException {
    DatagramSocket socket = new DatagramSocket(9999);

    byte[] buffer=new byte[100];
    DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

    socket.receive(packet);

    System.out.println(new String(packet.getData(),0,packet.getLength()));

    socket.close();
  }
}
