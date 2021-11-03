package com.shf16;

public class FinalTest {
  final int width=0;
  final int LEFT;
  final int RIGHT;
  {
    LEFT=1;
  }
  public FinalTest(){
    RIGHT=2;
  }
  public FinalTest(int n){
    RIGHT=n;
  }
  public void doWidth(){
//    width=20;
  }
  public static void main(String[] args) {
    int num=10;
    num=num+5;
  }
}


final class FinalA{}

//class B extends FinalA{}
