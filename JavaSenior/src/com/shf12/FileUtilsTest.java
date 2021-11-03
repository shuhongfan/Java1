package com.shf12;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileUtilsTest {
  public static void main(String[] args) {
    File src = new File("JavaSenior\\1.png");
    File dest = new File("JavaSenior\\2.png");

    try {
      FileUtils.copyFile(src,dest);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
