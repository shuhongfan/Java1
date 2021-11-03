package com.shf12;

import org.junit.Test;

import java.io.*;

public class ObjectInputOutputStreamTest {
  @Test
  public void test2(){
    ObjectInputStream ois = null;
    try {
      ois = new ObjectInputStream(new FileInputStream("object.data"));

      Object obj = ois.readObject();
      String str=(String) obj;
      System.out.println(str);

      Object person = ois.readObject();
      Person p=(Person) person;
      System.out.println(p);

    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        if (ois!=null) ois.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  @Test
  public void test1(){
    ObjectOutputStream oos = null;
    try {
      oos = new ObjectOutputStream(new FileOutputStream("object.data"));
      oos.writeObject(new String("我爱武汉"));
      oos.writeObject(new Person("王明",33,1001,new Account(55.3))); //NotSerializableException
      oos.flush();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (oos!=null) oos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
