package com.shf13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class URLTest1 {
  public static void main(String[] args) {
    HttpURLConnection urlConnection = null;
    InputStream is = null;
    FileOutputStream fos = null;
    try {
      URL url = new URL("http://127.0.0.1:9080/tomcat.svg");
      urlConnection = (HttpURLConnection) url.openConnection();

      urlConnection.connect();

      is = urlConnection.getInputStream();
      fos = new FileOutputStream("JavaSenior\\1.vsg");

      byte[] buffer=new byte[1024];
      int len;
      while ((len=is.read(buffer))!=-1)  fos.write(buffer,0,len);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (is!=null) is.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (fos!=null) fos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      urlConnection.disconnect();
    }
  }
}
