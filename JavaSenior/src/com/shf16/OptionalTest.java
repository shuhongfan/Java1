package com.shf16;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {
  @Test
  public void test4(){
    String str="beijing";
    Optional<String> op1 = Optional.ofNullable(str);
    String str2 = op1.orElse("shanghai");
    System.out.println(str2);
  }
  @Test
  public void test3(){
    String str="hello";
//    str=null;
    Optional<String> op1 = Optional.of(str);
    String s = op1.get();
    System.out.println(s);
  }

  @Test
  public void test1(){
    Girl girl = new Girl();
//    girl=null;
    Optional<Girl> optionalGirl = Optional.of(girl);
    System.out.println(optionalGirl);
  }

  @Test
  public void test2(){
    Girl girl = new Girl();
    girl=null;
    Optional<Girl> optionalGirl = Optional.ofNullable(girl);
    System.out.println(optionalGirl);

    Girl girl1 = optionalGirl.orElse(new Girl("赵丽颖"));
    System.out.println(girl1);
  }

}
