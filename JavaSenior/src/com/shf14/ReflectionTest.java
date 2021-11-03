package com.shf14;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
  @Test
  public void test4(){

  }

  @Test
  public void test3() throws ClassNotFoundException {
//    获取class的实例的方式   class的实例就对应着一个运行时类
//    调用运行时类的属性 .class
    Class<Person> clazz1 = Person.class;
    System.out.println(clazz1);

//    通过运行时类的对象  getClass()
    Person p1 = new Person();
    Class clazz2 = p1.getClass();
    System.out.println(clazz2);

//    调用class的静态方法  forName(String classPath)
    Class clazz3 = Class.forName("com.shf14.Person");
    System.out.println(clazz3);

//    使用类的加载器 ClassLoader
    ClassLoader classLoader = ReflectionTest.class.getClassLoader();
    Class<?> clazz4 = classLoader.loadClass("com.shf14.Person");

    System.out.println(clazz1==clazz2);
    System.out.println(clazz1==clazz3);
    System.out.println(clazz1==clazz4);
  }

  @Test
  public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
    Class personClass = Person.class;
//    通过反射 创建Person类的对象
    Constructor constructor = personClass.getConstructor(String.class, int.class);

    Object obj = constructor.newInstance("Tom", 12);
    Person p=(Person) obj;
    System.out.println(obj.toString());

    Field age = personClass.getDeclaredField("age");
    age.set(p,10);
    System.out.println(p.toString());

    Method show = personClass.getDeclaredMethod("show");
    show.invoke(p);

//    通过反射，可以调用Person类的所有结构
//    调用私有构造器
    Constructor con1 = personClass.getDeclaredConstructor(String.class);
    con1.setAccessible(true);
    Object p1 = con1.newInstance("jerry");
    System.out.println(p1);

//    调用私有属性
    Field name = personClass.getDeclaredField("name");
    name.setAccessible(true);
    name.set(p1,"HanMeimei");

//    调用私有方法
    Method showNation = personClass.getDeclaredMethod("showNation", String.class);
    showNation.setAccessible(true);
    Object nation = showNation.invoke(p1, "中国");// 相当于 p1.showNation("中国");
    System.out.println(nation);
  }

  @Test
  public void test1(){
    Person p1 = new Person("Tom", 12);
    p1.age=10;
    System.out.println(p1.toString());

    p1.show();

//    在Person类外部，不可以通过Person类的对象调用其内部私有结构
  }
}
