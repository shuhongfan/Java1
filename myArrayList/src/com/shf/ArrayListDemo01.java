package com.shf;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
//        array.add(1,"javaee");
        array.add(3,"javaee");
        System.out.println("array:"+array);
    }
}
