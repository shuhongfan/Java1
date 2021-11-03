package com.shf14;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MethodTest {
  @Test
  public void test5() throws Exception{
    Class<Person> clazz = Person.class;
//    获取指定的构造器
    Constructor<Person> declaredConstructor = clazz.getDeclaredConstructor(String.class);
//    保证构造器是可访问的
    declaredConstructor.setAccessible(true);
//    创建运行时类的对象
    Person person = declaredConstructor.newInstance("Tom");
    System.out.println(person);
  }
  @Test
  public void test4() throws Exception{
    Class<Person> clazz = Person.class;
//    创建运行时类的对象
    Person p = clazz.newInstance();
//    获取指定的某个方法   获取方法名称,参数类型
    Method showNation = clazz.getDeclaredMethod("showNation", String.class);
//    保证当前属性是可访问的
    showNation.setAccessible(true);
//    调用 invoke  方法调用者，方法实参
    Object returnValue = showNation.invoke(p, "CNN");
    System.out.println(returnValue);

//    调用静态方法
    Method showDesc = clazz.getDeclaredMethod("showDesc");
    showDesc.setAccessible(true);
    Object invoke = showDesc.invoke(Person.class);
  }

  @Test
  public void test3() throws Exception{
    Class<Person> clazz = Person.class;
//    创建运行时类对象
    Person p = clazz.newInstance();
//    获取运行时类中指定变量名的属性
    Field name = clazz.getDeclaredField("name");
//    保证当前属性是可访问的
    name.setAccessible(true);
//    获取、设置指定对象的属性值
    name.set(p,"Tom");
    System.out.println(name.get(p));
  }

  @Test
  public void test2(){
    Class<Person> clazz = Person.class;

    Constructor<?>[] constructors = clazz.getConstructors();
    for (Constructor c : constructors) System.out.println(c);

    Method[] declaredMethods = clazz.getDeclaredMethods();
    for (Method c : declaredMethods) System.out.println(c);
  }

  @Test
  public void test1(){
//    getMehods 获取当前运行时类机器所有父类中声明为public权限的方法
    Class<Person> clazz = Person.class;
    Method[] methods = clazz.getMethods();
    for (Method m: methods) {
      System.out.println(m);
    }
    System.out.println("***************************");

//    getDeclaredMethods 获取当前运行时类中声明的所有方法  不包含父类中声明
    Method[] declaredMethods = clazz.getDeclaredMethods();
    for (Method m: declaredMethods) {
      System.out.println(m);
    }
  }
}
