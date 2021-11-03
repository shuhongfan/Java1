package com.shf2;

public class StudentTest {
  public static void main(String[] args) {
//    声明Student类型的数组
    Student[] stus=new Student[20];
    for (int i = 0; i < stus.length; i++) {
      stus[i]=new Student();
      stus[i].number=i+1;
      stus[i].state=(int)(Math.random()*6+1);  //[1-6]
      stus[i].score=(int)(Math.random()*100+1);
    }

    StudentTest st=new StudentTest();
    st.print(stus);
    System.out.println("*************");

    st.searchState(stus,3);
    System.out.println("*************");

    st.sortScore(stus);
    st.print(stus);
  }
//  遍历Student数组
  public void print(Student[] stus){
    for (int i = 0; i < stus.length; i++) {
      System.out.println(stus[i].info());
    }
  }
  public void searchState(Student[] stus,int state){
    for (int i = 0; i < stus.length; i++) {
//      System.out.println("学号:"+stus[i].number+"\t年级："+stus[i].state+"\t成绩："+stus[i].score);
      if(stus[i].state==state) System.out.println(stus[i].info());
    }
  }
  public void sortScore(Student[] stus){
    for (int i = 0; i < stus.length-1; i++) {
      for (int j = 0; j < stus.length-1-i; j++) {
        if(stus[j].score>stus[j+1].score){
          Student s=stus[j];
          stus[j]=stus[j+1];
          stus[j+1]=s;
        }
      }
    }
  }
}

//类： 属性、方法、构造器、代码块、内部类
//面向对象三大特征： 封装、继承、多态

class Student{
  int number;
  int state;
  int score;
//  显示学生信息的方法
  public String info(){
    return "学号:"+number+"\t年级："+state+"\t成绩："+score;
  }
}
