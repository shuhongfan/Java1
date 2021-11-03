package com.shf9;

import com.shf3.Person;
import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest {
  @Test
  public void test1(){
    Object obj=null;
    String str=null;
    obj=str;

    Object[] arr1=null;
    Object[] arr2=null;
    arr1=arr2;

    List<Object> list1=null;
    List<String> list2=null;
//    此时的list1和list2的类型不具备子父类关系
//    list1=list2;
  }

  @Test
  public void test2(){
    AbstractList<String> list1=null;
    List<String> list2=null;
    ArrayList<String> list3=null;

    list1=list3;
  }

  @Test
  public void test3(){
    List<Object> list1=null;
    List<String> list2=null;
    List<?> list=null;

    list=list1;
    list=list2;

    List<String> list3=new ArrayList<>();
    list3.add("AA");
    list3.add("BB");
    list3.add("CC");
    list=list3;
//    list.add("")
    list.add(null);

    Object o = list.get(0);
    System.out.println(o);
  }

  public void print(List<?> list){
    Iterator<?> iterator = list.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());
  }

  @Test void test4(){
    List<? extends Person> list1=null;
    List<? super Person> list2=null;


  }
}
