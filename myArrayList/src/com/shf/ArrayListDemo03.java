package com.shf;

import java.util.ArrayList;

public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("Java");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        for (String s : array) {
            System.out.println(s);
        }
    }
}
