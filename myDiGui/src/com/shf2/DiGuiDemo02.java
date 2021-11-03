package com.shf2;

import java.io.File;

public class DiGuiDemo02 {
  public static void main(String[] args) {
    File file=new File("C:\\Demo\\JAVA");
    getAllFilePath(file);
  }
  public static void getAllFilePath(File srcFile){
    File[] fileArray = srcFile.listFiles();
    if (fileArray!=null){
      for (File file : fileArray)
        if (file.isDirectory()) getAllFilePath(file);
        else System.out.println(file.getAbsolutePath());
    }
  }
}
