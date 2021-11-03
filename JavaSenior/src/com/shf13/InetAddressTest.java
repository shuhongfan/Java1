package com.shf13;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
  public static void main(String[] args) throws UnknownHostException {
    InetAddress byName = InetAddress.getByName("10.1.1.1");
    System.out.println(byName);
  }
}
