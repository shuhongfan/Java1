package com.shf11;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
  public static void main(String[] args) {
    System.out.print("请输入要删除文件的名称：");
    Scanner scanner = new Scanner(System.in);
    File file = new File("D:\\DEMO\\JAVA\\JavaSenior\\io\\io1\\");
    File file1=new File(file+"\\"+scanner.next());
    System.out.println(file1);
    boolean delete = file1.delete();
    if (delete) System.out.println("删除成功");
    else System.out.println("删除失败");
  }
}
