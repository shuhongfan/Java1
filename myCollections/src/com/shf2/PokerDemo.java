package com.shf2;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
  public static void main(String[] args) {
    ArrayList<String> array=new ArrayList<>();

    String[] colors={"♠","♥","♦","♣"};
    String[] numbers={"2","3","4","6","7","8","9","10","J","Q","k","A"};
    for(String color:colors){
      for(String number:numbers){
        array.add(color+number);
      }
    }
    array.add("小王");
    array.add("大王");

    Collections.shuffle(array); // 洗牌


    ArrayList<String> gamer1Array=new ArrayList<>();
    ArrayList<String> gamer2Array=new ArrayList<>();
    ArrayList<String> gamer3Array=new ArrayList<>();
    ArrayList<String> dpArray=new ArrayList<>();

    for(int i=0;i<array.size();i++) {
      String poker = array.get(i);
      if(i>=array.size()-3) dpArray.add(poker);
      else if(i%3==0) gamer1Array.add(poker);
      else if(i%3==1) gamer2Array.add(poker);
      else if(i%3==2) gamer3Array.add(poker);
    }

    lookPoker("玩家一",gamer1Array);
    lookPoker("玩家二",gamer2Array);
    lookPoker("玩家三",gamer3Array);
    lookPoker("底牌",dpArray);
  }
  public static void lookPoker(String name,ArrayList<String> array){
    System.out.print(name+" 的牌是：");
    for(String poker:array){
      System.out.print(poker+" ");
    }
    System.out.println();
  }
}
