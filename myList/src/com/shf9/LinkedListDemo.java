package com.shf9;

import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<String> linkedList=new LinkedList<>();
    linkedList.add("hello");
    linkedList.add("world");
    linkedList.add("java");

    linkedList.addFirst("javase");
    linkedList.addLast("javaee");
    System.out.println(linkedList);

    System.out.println(linkedList.removeFirst());
    System.out.println(linkedList.removeLast());

    System.out.println(linkedList.getFirst());
    System.out.println(linkedList.getLast());
  }
}
