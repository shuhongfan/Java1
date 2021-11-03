package com.shf14;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Vector v=new Vector();
    int maxScore=0;
    char level;
    while (true){
      System.out.println("请输入学生成绩（以负数代表输入结束）");
      int score = sc.nextInt();
      if (score<0) break;
//      Integer isScore=new Integer(score);
      v.addElement(score);
      if (maxScore<score) maxScore=score;
    }

    for (int i = 0; i < v.size(); i++) {
      Object obj = v.elementAt(i);
//      Integer inScore=(Integer) obj;
//      int score=inScore.intValue();
      int score=(int)obj;
      if (maxScore-score<=10)  level='A';
      else if (maxScore-score<=20)  level='B';
      else if (maxScore-score<=30)  level='C';
      else level='D';

      System.out.println("Student-"+i+" score is "+score+" , level is  "+level);
    }
  }
}
