package com.shf4;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {
  @Test
  public void test6(){

  }

  @Test
  public void test5(){
    String[] arr=new String[]{"AA","CC","KK","MM","GG","JJ","DD"};
    Arrays.sort(arr, new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if (o1 instanceof String && o2 instanceof String){
          String s1=(String) o1;
          String s2=(String) o2;
          return -s1.compareTo(s2);
        }
        throw new RuntimeException("类型不匹配");
      }
    });
    System.out.println(Arrays.toString(arr));
  }

  @Test
  public void test4(){
    Goods[] arr=new Goods[5];
    arr[0]=new Goods("Lenovo",34);
    arr[1]=new Goods("Dell",43);
    arr[2]=new Goods("XioaMi",12);
    arr[3]=new Goods("Microsoft",65);
    arr[4]=new Goods("HuaWei",65);
    Arrays.sort(arr, new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if (o1 instanceof Goods && o2 instanceof Goods){
          Goods g1=(Goods) o1;
          Goods g2=(Goods) o2;
          if (g1.getName().equals(g2.getName())){
            return -Double.compare(g1.getPrice(), g2.getPrice());
          } else {
            return g1.getName().compareTo(g2.getName());
          }
        }
        throw new RuntimeException("输入的数据不一致");
      }
    });
    System.out.println(Arrays.toString(arr));
  }

  @Test
  public void test3(){
    String[] arr=new String[]{"AA","CC","KK","MM","GG","JJ","DD"};
    Arrays.sort(arr, new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if (o1 instanceof String && o2 instanceof String){
          String s1=(String) o1;
          String s2=(String) o2;
          return -s1.compareTo(s2);
        }
        throw new RuntimeException("输入的数据不一致");
      }
    });
    System.out.println(Arrays.toString(arr));
  }

  @Test
  public void test2(){
    Goods[] arr=new Goods[5];
    arr[0]=new Goods("Lenovo",34);
    arr[1]=new Goods("Dell",43);
    arr[2]=new Goods("XioaMi",12);
    arr[3]=new Goods("Microsoft",65);
    arr[4]=new Goods("HuaWei",65);
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  @Test
  public void test1(){
    String[] arr=new String[]{"AA","CC","KK","MM","GG","JJ","DD"};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
