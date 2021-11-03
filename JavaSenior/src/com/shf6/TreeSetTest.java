package com.shf6;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
  @Test
  public void test2(){
    Comparator com=new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if (o1 instanceof User && o2 instanceof User){
          User u1=(User) o1;
          User u2=(User) o2;
          int compare=u1.getName().compareTo(u2.getName());
          if (compare==0) return Integer.compare(u1.getAge(),u2.getAge());
          else return compare;
        } else throw new RuntimeException("输入的数据类型不匹配");
      }
    };
    TreeSet treeSet=new TreeSet(com);

    treeSet.add(new User("Tom",12));
    treeSet.add(new User("Jack",12));
    treeSet.add(new User("Jim",32));
    treeSet.add(new User("Mike",2));
    treeSet.add(new User("Mike",56));

    Iterator iterator = treeSet.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());
  }
  @Test
  public void test1(){
    TreeSet treeSet = new TreeSet();
//    treeSet.add(123);
//    treeSet.add(-31);
//    treeSet.add(-1);
//    treeSet.add(41);
//    treeSet.add(-33);
//    System.out.println(treeSet);

    treeSet.add(new User("Tom",12));
    treeSet.add(new User("Jack",12));
    treeSet.add(new User("Jim",32));
    treeSet.add(new User("Mike",2));
    treeSet.add(new User("Mike",56));

    Iterator iterator = treeSet.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());
  }
}
