package com.shf;
import java.util.Scanner;

public class Demo23 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("请输入学生人数:");
    int number=sc.nextInt();

    int[] scores=new int[number];
    int max=scores[0];
    for (int i = 0; i < scores.length; i++) {
      System.out.print("请输入第"+(i+1)+"个学生的成绩: ");
      scores[i]=sc.nextInt();
      if(scores[i]>max) max=scores[i];
    }

    char level;
    for (int i = 0; i < scores.length; i++) {
      if(max-scores[i]<=10) level='A';
      else if(max-scores[i]<=20) level='B';
      else if(max-scores[i]<=30) level='C';
      else level='D';
      System.out.println("Student "+(i+1)+" score is "+scores[i]+" grade is "+level);
    }
  }


}
