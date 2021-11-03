package com.shf8;

import java.io.*;

public class CopyFolderDemo {
  public static void main(String[] args) throws IOException{
//    创建数据源目录File对象
    File srcFolder=new File("myCharStream\\src\\com\\shf");

//    获取数据源目录File对象的名称
    String scrFolderName=srcFolder.getName()+"-copy";

//    创建目的地目录File对象
    File destFolder=new File("myCharStream",scrFolderName);

//    判断目的地目录对应的file是否存在，如果不存在，则创建
    if(!destFolder.exists()) destFolder.mkdir();

//    获取数据源目录下所有文件的File数组
    File[] listFiles = srcFolder.listFiles();

//    遍历file数组，得到每一个file对象
    for(File srcFile:listFiles){
//      获取源文件
      String srcFileName = srcFile.getName();
//      获取目的地文件file对象
      File destFile=new File(destFolder,srcFileName);
//      复制文件
      copyFile(srcFile,destFile);
    }
  }

  private static void copyFile(File srcFile, File destFile) throws IOException {
    BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile));
    BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));

    byte[] bys=new byte[1024];
    int len;
    while((len=bis.read(bys))!=-1) bos.write(bys,0,len);

    bis.close();
    bos.close();
  }

}
