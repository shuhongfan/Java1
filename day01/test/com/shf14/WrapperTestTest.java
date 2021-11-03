package com.shf14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapperTestTest {

  @Test
  void test1() {
    int num1=10;
    Integer i1 = new Integer(num1);
    System.out.println(i1.toString());
    Integer i2=new Integer("123asd");
    System.out.println(i2.toString());
  }
}