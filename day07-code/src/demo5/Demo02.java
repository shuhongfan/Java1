package demo5;

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);

        boolean success=list.add("刘洋");
        System.out.println(list);
        System.out.println("是否成功："+success);

        list.add("高圆圆");
        list.add("fdgd");
        list.add("fsdfdsf");
        list.add("qqqq");
        System.out.println(list);

        String name=list.get(2);
        System.out.println(name);

        String whoremove=list.remove(4);
        System.out.println(list);
        System.out.println(whoremove);

        int size=list.size();
        System.out.println("集合的长度是："+size);
    }
}
