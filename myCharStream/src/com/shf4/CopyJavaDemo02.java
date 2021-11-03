package com.shf4;

import java.io.*;

public class CopyJavaDemo02 {
  public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new FileReader("myCharStream\\myCharStream.iml"));
    BufferedWriter bw=new BufferedWriter(new FileWriter("myCharStream\\copy6.iml"));

    String line;
    while ((line=br.readLine())!=null){
      bw.write(line);
      bw.newLine();
      bw.flush();
    }

    br.close();
    bw.close();
  }
}
