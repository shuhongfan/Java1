package com.shf7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
  @Test
  public void test1(){
    List list=new ArrayList();
    list.add(123);
    list.add(43);
    list.add(765);
    list.add(765);
    list.add(765);
    list.add(-97);
    list.add(0);

    System.out.println(list);

    //    Collections.reverse(list);  //反转
    //    Collections.shuffle(list);  // 随机
    //    Collections.sort(list);  // 排序

    //    int frequency = Collections.frequency(list,765);
    //    System.out.println(frequency);

    List dest = Arrays.asList(new Object[list.size()]);
    Collections.copy(dest,list);
    System.out.println(dest);

    List list1 = Collections.synchronizedList(list); // 线程安全的

    System.out.println(list);
  }
}
