package com.shf8;

import java.io.*;

public class CopyFoldersDemo {
  public static void main(String[] args) throws IOException{
    File srcFile=new File("myCharStream\\src\\com\\shf8");
    File destFile=new File("myCharStream\\");

    copyFolder(srcFile,destFile);
  }

  private static void copyFolder(File srcFile, File destFile) throws IOException{
    if(srcFile.isDirectory()) {
      String srcFileName = srcFile.getName();
      File newFolder=new File(destFile,srcFileName);
      if(!newFolder.exists()) newFolder.mkdir();

      File[] fileArray = srcFile.listFiles();
      for(File file:fileArray){
        copyFolder(file,newFolder);
      }
    } else {
      File newFile=new File(destFile,srcFile.getName());
      copyFile(srcFile, newFile);
    }
  }

  //  字节缓冲流复制文件
  private static void copyFile(File srcFile, File destFile) throws IOException {
    BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile));
    BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));

    byte[] bys=new byte[1024];
    int len;
    while((len=bis.read(bys))!=-1) bos.write(bys,0,len);
    bos.close();
    bis.close();
  }
}
