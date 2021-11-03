package com.shf7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToFileDemo {
  public static void main(String[] args) throws IOException {
    TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {
      @Override
      public int compare(Student s1, Student s2) {
        int num = s2.geSum() - s1.geSum();
        int num2 = num==0?s1.getChinese()-s2.getChinese():num;
        int num3 = num2==0?s1.getMath()-s2.getMath():num;
        int num4 = num3==0?s1.getName().compareTo(s2.getName()):num3;
        return num4;
      }
    });


    for (int i = 0; i < 5; i++) {
      Scanner sc=new Scanner(System.in);
      System.out.printf("请录入第"+(i+1)+"个学生信息：");
      System.out.printf("姓名：");
      String name = sc.nextLine();
      System.out.printf("语文成绩:");
      int chinese = sc.nextInt();
      System.out.printf("数学成绩:");
      int math = sc.nextInt();
      System.out.printf("英语成绩:");
      int english = sc.nextInt();

      Student s=new Student();
      s.setName(name);
      s.setChinese(chinese);
      s.setEnglish(english);
      s.setMath(math);

      ts.add(s);
    }

    BufferedWriter bw=new BufferedWriter(new FileWriter("myCharStream\\ts.txt"));

    for(Student s:ts){
      StringBuilder sb=new StringBuilder();
      sb.append(s.getName()).append(",").
              append(s.getChinese()).append(",").
              append(s.getMath()).append(",").append(s.getEnglish())
              .append(",").append(s.geSum());

      bw.write(sb.toString());
      bw.newLine();
      bw.flush();
    }
    bw.close();
  }
}
