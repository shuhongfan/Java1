package com.shf9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
  public static void main(String[] args) {

  }

  private static void method1(){
    try (FileReader fr=new FileReader("fr.txt");
         FileWriter fw=new FileWriter("fw.txt");){
      char[] chs=new char[1024];
      int len;
      while((len=fr.read())!=-1) fw.write(chs,0,len);
    } catch (IOException e){
      e.printStackTrace();
    }
  }
  private static void method2() throws IOException{
    FileReader fr=new FileReader("fr.txt");
    FileWriter fw=new FileWriter("fw.txt");
    try (fr;fw){
      char[] chs=new char[1024];
      int len;
      while((len=fr.read())!=-1) fw.write(chs,0,len);
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}
