package com.shf14;

import org.junit.Test;

import java.util.Random;

public class NewInstanceTest {
  @Test
  public void test1() throws InstantiationException, IllegalAccessException {
    Class<Person> clazz = Person.class;
//    newInstance 创建运行时类的对象
    Person obj = clazz.newInstance();
    System.out.println(obj);
  }

  @Test
  public void test2(){

  }
}
