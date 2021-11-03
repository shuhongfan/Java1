package com.shf16;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * -> : kambda 操作符  或  箭头操作符
 */
public class LambdaTest {
  @Test
  public void test6(){
    List<String> list = Arrays.asList("北京", "南京", "天津", "东京");
    List<String> filterString = filterString(list, new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.contains("京");
      }
    });
    System.out.println(filterString);

    List<String> filterString2=filterString(list,s -> s.contains("京"));
    System.out.println(filterString2);
  }
  public List<String> filterString(List<String> list, Predicate<String> pre){
    ArrayList<String> filterList = new ArrayList<>();
    for (String s:list){
      if (pre.test(s)) filterList.add(s);
    }
    return filterList;
  }

  @Test
  public void test5(){
    happyTime(
        500,
        new Consumer<Double>() {
          @Override
          public void accept(Double aDouble) {
            System.out.println("价格为："+aDouble);
          }
        });

    happyTime(400, money -> System.out.println("价格为："+money));
  }
  public void happyTime(double money,Consumer<Double> con){
    con.accept(money);
  }

  @Test
  public void test4(){
    Comparator<Integer> com1=new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
      }
    } ;
    System.out.println(com1.compare(3,4));
    System.out.println("**************************");

    Comparator<Integer> com2=(o1, o2) -> {
      System.out.println(o1);
      System.out.println(o2);
      return o1.compareTo(o2);
    };
    System.out.println(com2.compare(3,4));
  }

  @Test
  public void test3(){
    Consumer<String> consumer = new Consumer<>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    };
    consumer.accept("HelloWorld");
    System.out.println("**************************");

    Consumer<String> consumer1 = s -> System.out.println(s);
    consumer1.accept("haha");
  }

  @Test
  public void test2(){
    Comparator<Integer> com1=new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1,o2);
      }
    };
    int compare = com1.compare(12, 32);
    System.out.println(compare);
    System.out.println("*************************");

//    lambda
    Comparator<Integer> com2= (o1,o2)-> Integer.compare(o1,o2);
    int compare2 = com2.compare(12, 32);
    System.out.println(compare2);
    System.out.println("*************************");

    Comparator<Integer> com3= Integer::compare;
    int compare3 = com2.compare(12, 32);
    System.out.println(compare3);
  }

  @Test
  public void test1(){
    Runnable r1=new Runnable() {
      @Override
      public void run() {
        System.out.println("我爱中国");
      }
    };
    r1.run();
    System.out.println("*************************");

    Runnable r2=()->System.out.println("我爱china");
    r2.run();
  }
}
