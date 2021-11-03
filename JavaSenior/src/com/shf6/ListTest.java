package com.shf6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * List 有序的，可重复的数据
 * ArrayList  作为list接口的主要实现类，线程不安全的，效率高，底层使用object存储
 * LinkedList  对于频繁的插入、删除操作，使用此类效率比arrayList高。底层使用双向链表存储
 * Vector  作为list接口的古老实现类，线程安全的，效率低，底层使用object存储
 *
 * add
 * remove
 * set
 * get
 * add
 * size
 * iterator
 */
public class ListTest {
  @Test
  public void test2(){
    ArrayList list=new ArrayList();
    list.add(123);
    list.add(456);
    list.add("AA");
    list.add(new Person("Tom",22));
    list.add(false);

    Iterator iterator = list.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());
    System.out.println("*********************");

    for (Object o : list) System.out.println(o);
    System.out.println("*********************");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    list.forEach(System.out::println);
  }
  @Test
  public void test1(){
    ArrayList list=new ArrayList();
    list.add(123);
    list.add(456);
    list.add("AA");
    list.add(new Person("Tom",22));
    list.add(false);

    System.out.println(list);

    list.add(1,"BB");
    System.out.println(list);

    List list1= Arrays.asList(1,2,3);
    list.addAll(list1);

    System.out.println(list);

    System.out.println(list.get(1));

    System.out.println(list.indexOf("AA"));

    System.out.println(list.lastIndexOf(456));

    System.out.println(list.remove(1));
    System.out.println(list);

    System.out.println(list.set(1,"CC"));
    System.out.println(list);

    List sublist = list.subList(2, 4);
    System.out.println(sublist);
    System.out.println(list);
  }
}
