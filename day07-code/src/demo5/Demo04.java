package demo5;

import java.util.ArrayList;

public class Demo04 {
    public static void main(String[] args) {
        ArrayList<String> listA=new ArrayList<>();
        ArrayList<Integer> listB=new ArrayList<>();
        listB.add(100);
        listB.add(0);
        listB.add(110);
        listB.add(110);
        listB.add(10);
        System.out.println(listB);

        int num=listB.get(1);
        System.out.println(num);
    }
}
