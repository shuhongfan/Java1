package com.shf2;

import java.io.*;

public class CopyJavaDemo {
  public static void main(String[] args) throws IOException {
//    BufferedReader br=new BufferedReader(new FileReader("myOtherStream\\myOtherStream.iml"));
//    BufferedWriter bw=new BufferedWriter(new FileWriter("myOtherStream\\copy.iml"));
//
//    String line;
//    while((line=br.readLine())!=null) {
//      bw.write(line);
//      bw.newLine();
//      bw.flush();
//    }
//
//    bw.close();
//    br.close();

    BufferedReader br=new BufferedReader(new FileReader("myOtherStream\\myOtherStream.iml"));
    PrintWriter pw=new PrintWriter(new FileWriter("myOtherStream\\copy2.iml"),true);

    String line;
    while((line=br.readLine())!=null) pw.println(line);

    br.close();
    pw.close();
  }
}
