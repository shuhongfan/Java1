package com.shf3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
  public static void main(String[] args) {
    HashMap<Integer,String> hm=new HashMap<>();

    ArrayList<Integer> array=new ArrayList<>();
    String[] colors={"♦","♣","♥","♠"};
    String[] numbers={"3","4","5","6","7","8","9","10","J","Q","k","A","2"};

    int index =0;
    for(String number:numbers)
      for(String color:colors){
        hm.put(index,color+number);
        array.add(index);
        index++;
      }
    hm.put(index,"小王");
    array.add(index);
    index++;
    hm.put(index,"大王");
    array.add(index);

    Collections.shuffle(array);

    TreeSet<Integer> gamer1Set=new TreeSet<>();
    TreeSet<Integer> gamer2Set=new TreeSet<>();
    TreeSet<Integer> gamer3Set=new TreeSet<>();
    TreeSet<Integer> dpSet=new TreeSet<>();

    for(int i=0;i<array.size();i++){
      Integer x = array.get(i);
      if(i>=array.size()-3) dpSet.add(x);
      else if(i%3==0) gamer1Set.add(x);
      else if(i%3==1) gamer2Set.add(x);
      else if(i%3==2) gamer3Set.add(x);
    }

    lookPoker("玩家1",gamer1Set,hm);
    lookPoker("玩家2",gamer2Set,hm);
    lookPoker("玩家3",gamer3Set,hm);
    lookPoker("底牌",dpSet,hm);
  }
  public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
    System.out.print(name + " 的牌是：");
    for(Integer key:ts) {
      String poker = hm.get(key);
      System.out.print(poker+" ");
    }
    System.out.println();
  }
}
