package com.shf12;

import org.junit.Test;

import java.io.*;
import java.util.Locale;

public class OtherStreamTest {
  @Test
  public void test4() throws IOException {
    DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
    String name = dis.readUTF();
    int age = dis.readInt();
    boolean isMale = dis.readBoolean();

    System.out.println("name="+name);
    System.out.println("age="+age);
    System.out.println("isMale="+isMale);
  }

  @Test
  public void test3() throws IOException {
    DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
    dos.writeUTF("Java");
    dos.writeInt(23);
    dos.writeBoolean(true);
    dos.flush();
    dos.close();
  }

  @Test
  public void test2(){
    PrintStream ps = null;
    try {
      FileOutputStream fos = new FileOutputStream("print.txt");
//      打印流
      ps = new PrintStream(fos, true);
      if (ps!=null) System.setOut(ps);

      for (int i = 0; i <= 255; i++) {
        System.out.print((char) i);
        if (i % 50 == 0) System.out.println();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      if (ps!=null) ps.close();
    }
   }

  @Test
  public void test1(){
    BufferedReader br = null;
    try {
      InputStreamReader isr = new InputStreamReader(System.in);
      br = new BufferedReader(isr);

      while (true){
        System.out.println("请输入字符串：");
        String data = br.readLine();
  //      if (data.equalsIgnoreCase("e")||data.equalsIgnoreCase("exit")){
        if ("e".equalsIgnoreCase(data)||"exit".equalsIgnoreCase(data)){
          System.out.println("程序结束");
          break;
        }

        String str = data.toUpperCase(Locale.ROOT);
        System.out.println(str);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br!=null) br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
