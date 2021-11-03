package com.shf16;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPITest {
  @Test
  public void test7(){
    List<Employee> employees = EmployeeData.getEmployees();
//    工资大于6000  返回list  有序
    List<Employee> collect = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toList());
    collect.forEach(System.out::println);
    System.out.println("*********************");
//      返回set  无序
    Set<Employee> set = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toSet());
    set.forEach(System.out::println);
  }

  @Test
  public void test6(){  // 归约
//    1-10累加
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Integer reduce = list.stream().reduce(0, Integer::sum);
    System.out.println(reduce);

    List<Employee> employees = EmployeeData.getEmployees();
    Stream<Double> doubleStream = employees.stream().map(Employee::getSalary);
    Optional<Double> sum = doubleStream.reduce(Double::sum);
//    Optional<Double> sum = doubleStream.reduce((d1,d2)->d1+d2);
    System.out.println(sum);
  }

  @Test
  public void test5(){ // 排序
//    List<Integer> list = Arrays.asList(12, 43, 65, 34, 87, 0, -98);
//    list.stream().sorted().forEach(System.out::println);

    List<Employee> employees = EmployeeData.getEmployees();
//    employees.stream().sorted((e1,e2)->Integer.compare(e1.getAge(),e2.getAge())).forEach(System.out::println);
    employees.stream().sorted((e1,e2)->{
      int age = Integer.compare(e1.getAge(), e2.getAge());
      if (age!=0) return age;
      else return Double.compare(e1.getSalary(),e2.getSalary());
    }).forEach(System.out::println);
  }

  @Test
  public void test4(){  // 映射
    List<Employee> employees = EmployeeData.getEmployees();
    Stream<Employee> stream = employees.stream();
//    查询员工薪资大于7000的员工信息
    stream.filter(e->e.getSalary()>7000).forEach(System.out::println);
    System.out.println();
//    前三个
    employees.stream().limit(3).forEach(System.out::println);
    System.out.println();
//    跳过前三个
    employees.stream().skip(3).forEach(System.out::println);
    System.out.println();

//    去重
    employees.add(new Employee(1010, "刘强东", 40, 8000));
    employees.add(new Employee(1010, "刘强东", 40, 8000));
    employees.add(new Employee(1010, "刘强东", 40, 8000));
    employees.add(new Employee(1010, "刘强东", 40, 8000));
//    System.out.println(employees);
    employees.stream().distinct().forEach(System.out::println);
  }

  @Test
  public void test3(){
    Stream.iterate(0,t->t+2).limit(10).forEach(System.out::println);
  }

  @Test
  public void test2(){
    int[] arr = {1, 2, 3, 4, 5, 6};

    IntStream stream = Arrays.stream(arr);

    Employee e1 = new Employee(1001, "Tom");
    Employee e2 = new Employee(1002, "Jerry");
    Employee[] arr1 = {e1, e2};
    Stream<Employee> stream1 = Arrays.stream(arr1);

  }

  @Test
  public void test1(){
    List<Employee> employees = EmployeeData.getEmployees();
//    返回一个顺序流
    Stream<Employee> stream = employees.stream();
//    返回一个并行流
    Stream<Employee> employeeStream = employees.parallelStream();
  }
}
