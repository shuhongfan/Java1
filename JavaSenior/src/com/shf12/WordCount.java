package com.shf12;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {
  public static void main(String[] args) {
    testWordCount(
        "D:\\DEMO\\JAVA\\JavaSenior\\hello.txt", "D:\\DEMO\\JAVA\\JavaSenior\\hello2.txt");
  }

  public static void testWordCount(String srcPath,String destPath){
    FileReader fr = null;
    BufferedWriter bw = null;
    try {
      HashMap<Character, Integer> map = new HashMap<>();
      fr = new FileReader(srcPath);
      int c=0;
      while ((c=fr.read())!=-1) {
        char ch=(char) c;
        if (map.get(ch)==null) map.put(ch,1);
        else map.put(ch,map.get(ch)+1);
      }

      bw = new BufferedWriter(new FileWriter(destPath));
      Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
      for (Map.Entry<Character, Integer> entry: entrySet){
        switch (entry.getKey()){
          case ' ': bw.write("空格="+entry.getValue());break;
          case '\t': bw.write("tab="+entry.getValue());break;
          case '\r': bw.write("回车="+entry.getValue());break;
          case '\n': bw.write("换行="+entry.getValue());break;
          default: bw.write(entry.getKey()+"="+entry.getValue());break;
        }
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fr!=null) fr.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        if (bw!=null) bw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
