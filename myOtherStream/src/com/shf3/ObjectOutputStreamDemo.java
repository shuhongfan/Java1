package com.shf3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
  public static void main(String[] args) throws IOException {
    ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("myOtherStream\\oos.txt"));

    Student s=new Student("林青霞",30);

    oos.writeObject(s);

    oos.close();
  }
}
