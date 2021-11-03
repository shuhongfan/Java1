package com.shf6;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * HashSet  线程不安全，可以存储null值
 * LinkedHashSet Hashset的子类，遍历时，可以按照添加的顺序遍历
 * TreeSet
 */
public class SetTest {
  @Test
  public void test1(){
//    set无序，不可重复
//    Set set = new HashSet();
    Set set = new LinkedHashSet();
    set.add(456);
    set.add(123);
    set.add(123);
    set.add("AA");
    set.add("CC");
    set.add(new User("Tom",22));
    set.add(new User("Tom",22));
    set.add(129);

//    for (Object o: set) {
//      System.out.println(o);
//    }

    Iterator iterator = set.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());
  }
}
