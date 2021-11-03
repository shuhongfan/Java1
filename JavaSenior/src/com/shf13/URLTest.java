package com.shf13;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
  public static void main(String[] args) {
    URL url = null;
    try {
      url = new URL("http://127.0.0.1:9080/tomcat.svg");
      System.out.println(url.getProtocol());
      System.out.println(url.getHost());
      System.out.println(url.getPort());
      System.out.println(url.getPath());
      System.out.println(url.getFile());
      System.out.println(url.getQuery());
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }

  }
}
