package com.shf16;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefTest {
  @Test
  public void test7(){
    Employee employee=new Employee(1001,"jerru",14,65600);
    Function<Employee,String> fun1=e->e.getName();
    System.out.println(fun1.apply(employee));
    System.out.println("**************************");

    Function<Employee,String> fun2=Employee::getName;
    System.out.println(fun2.apply(employee));
  }

  @Test
  public void test6(){
    BiPredicate<String,String> pre1=(s1,s2)->s1.equals(s2);
    System.out.println(pre1.test("abc","abc"));
    System.out.println("**************************");

    BiPredicate<String,String> pre2=String::equals;
    System.out.println(pre2.test("ada","sdfds"));
  }

  @Test
  public void test5(){
    Comparator<String> com1=(s1,s2)->s1.compareTo(s2);
    System.out.println(com1.compare("das","ca"));
    System.out.println("**************************");

    Comparator<String> com2=String::compareTo;
    System.out.println(com2.compare("abd","ba"));
  }

  @Test
  public void test4(){
    Function<Double,Long> func=new Function<Double, Long>() {
      @Override
      public Long apply(Double aDouble) {
        return Math.round(aDouble);
      }
    };
    System.out.println(func.apply(132.3));
    System.out.println("**************************");

    Function<Double,Long> fun2=Math::round;
    System.out.println(fun2.apply(123.6));
  }

  @Test
  public void test3(){
    Comparator<Integer> com1=(t1,t2)->Integer.compare(t1,t2);
    System.out.println(com1.compare(12,33));
    System.out.println("**************************");

    Comparator<Integer> com2=Integer::compare;
    System.out.println(com2.compare(12,3));
    System.out.println("**************************");
  }

  @Test
  public void test2(){
    Employee p1 = new Employee(1001, "Tom",14, 5600);
    Supplier<String> sup1=()->p1.getName();
    System.out.println(sup1.get());
    System.out.println("**************************");
  }

  @Test
  public void test1(){
    Consumer<String> con1=str->System.out.println(str);
    con1.accept("北京");
    System.out.println("**************************");

    PrintStream ps = System.out;
    Consumer<String> con2=ps::println;
    con2.accept("beijing");
  }
}
