package com.shf6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
  @Test
  public void test2(){
    Collection coll=new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new String("Tom"));
    coll.add(false);

    Iterator iterator = coll.iterator();
    while (iterator.hasNext()){
      Object obj = iterator.next();
      if ("Tom".equals(obj)) iterator.remove();
    }

    Iterator iterator1 = coll.iterator();
    while (iterator1.hasNext()){
      System.out.println(iterator1.next());
    }
  }

  @Test
  public void test1(){
    Collection coll=new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new String("Tom"));
    coll.add(false);

    Iterator iterator = coll.iterator();
//    for (int i = 0; i < coll.size(); i++) {
//      System.out.println(iterator.next());
//    }

//    迭代器 遍历
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
