package com.shf4;

import java.io.*;

public class BufferdStreamDemo02 {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw=new BufferedWriter(new FileWriter("myCharStream\\bw.txt"));
    BufferedReader br=new BufferedReader(new FileReader("myCharStream\\bw.txt"));

    for(int i=0;i<2;i++){
      bw.write("hello"+i);
      bw.newLine();
      bw.flush();
    }

//    String line=br.readLine();
//    System.out.println(line);
//    line=br.readLine();
//    System.out.println(line);
//    line=br.readLine();
//    System.out.println(line);

    String line;
    while ((line = br.readLine()) != null) System.out.println(line);

    bw.close();
    br.close();
  }
}
