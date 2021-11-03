package com.shf8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest1 {
  @Test
  public void test1(){
    Order order=new Order();
    order.setOrderT(123);
    order.setOrderT("Abc");

    Order<String> order1=new Order<>("orderAA",1001,"sdf");
    order1.setOrderT("AA");
  }

  @Test
  public void test2(){
    SubOrder subOrder = new SubOrder();
    subOrder.setOrderT(1122);

    SubOrder1<String> subOrder1 = new SubOrder1<>();
    subOrder1.setOrderT("sdfsdf");
  }

  @Test
  public void test3(){
    ArrayList<String> list1=null;
    ArrayList<String> list2=null;

    list1=list2;
  }

  @Test
  public void test4(){
    Order<String> order = new Order<>();
    Integer[] arr = {1, 2, 3, 4};
    List<Integer> list = order.copyFromArrayToList(arr);
    System.out.println(list);
  }
}
