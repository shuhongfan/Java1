package com.shf19;


interface Filial{
  default void help(){
    System.out.println("老妈，我来救你了");
  }
}

interface Spoony{
  default void help(){
    System.out.println("媳妇，别怕，我来了");
  }
}

public class Man implements Filial,Spoony{
  @Override
  public void help() {
    System.out.println("我该救谁呢？");
  }
}
