package com.shf;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
//        System.out.println(array.remove("world"));
//        System.out.println(array.remove("world1"));
//        System.out.println(array.remove(1));
        System.out.println(array.set(1, "javaee"));
        System.out.println(array.get(0));
        System.out.println(array.size());
        System.out.println("array:" + array);
    }
}
