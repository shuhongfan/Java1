package com.shf6;

import org.junit.Test;

import java.util.*;

public class CollectionTest {
  @Test
  public void test5(){
    Collection coll=new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new String("Tom"));
    coll.add(false);
    System.out.println(coll.hashCode());

    Object[] array = coll.toArray();
    System.out.println(Arrays.toString(array));

    List<String> asList = Arrays.asList(new String[]{"AA","BB","CC"});
    System.out.println(asList);

    List arr1=Arrays.asList(new int[]{123,456});
    System.out.println(arr1);

  }
  @Test
  public void test4(){
    Collection coll=new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new String("Tom"));
    coll.add(false);

    Collection coll1=new ArrayList();
    coll1.add(456);
    coll1.add(123);
    coll1.add(new String("Tom"));
    coll1.add(false);

    System.out.println(coll.equals(coll1));
  }
  @Test
  public void test3(){
    Collection coll=new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new String("Tom"));
    coll.add(false);

    Collection coll1=Arrays.asList(123,456,789);
    coll.retainAll(coll1); //  交集
    System.out.println(coll);
  }

  @Test
  public void test2(){
    Collection coll=new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new String("Tom"));
    coll.add(false);
//    Person p = new Person("Jerry", 20);
//    coll.add(p);
    coll.add(new Person("Jerry", 20));

    boolean contains = coll.contains(123);
    System.out.println(contains);

    System.out.println(coll.contains(new String("Tom")));
    System.out.println(coll.contains(new Person("Jerry", 20)));

    Collection coll1= Arrays.asList(123,456);
    System.out.println(coll.containsAll(coll1)); //差集
    coll.removeAll(coll1);

    System.out.println(coll.remove(123));
    System.out.println(coll.remove(new Person("Jerry", 20)));
    System.out.println(coll);
  }

  @Test
  public void test1(){
    Collection coll=new ArrayList();

    coll.add("AA");
    coll.add("BB");
    coll.add(123);
    coll.add(new Date());

    System.out.println(coll.size());

    Collection coll1=new ArrayList();
    coll1.add(456);
    coll1.add("CC");
    coll.addAll(coll1);

    System.out.println(coll1.size());
    System.out.println(coll);
    System.out.println(coll1);

    coll.clear();
    System.out.println(coll.isEmpty());
  }
}
