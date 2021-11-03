package com.shf16;

public class TemplateTest {
  public static void main(String[] args) {
    SubTemplate t=new SubTemplate();
    t.spendTime();
  }
}

abstract class Template{
  public void spendTime(){
    long start=System.currentTimeMillis();
    code();
    long end=System.currentTimeMillis();
    System.out.println("花费的时间为："+(end-start));
  }
  public abstract void code();
}

class SubTemplate extends Template{
  @Override
  public void code() {
    for (int i = 2; i < 1000; i++) {
      boolean isFlay=true;
      for (int j=2;j<=Math.sqrt(i);j++){
        if (i%j==0) {
          isFlay=false;
          return;
        }
      }
      if (isFlay==true) System.out.println(i);
    }
  }
}
