package demo5;

import java.util.ArrayList;
import java.util.Random;

public class Demo08 {
    public static void main(String[] args) {
        ArrayList<Integer> bigList=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100)+1;
            bigList.add(num);
        }
        ArrayList<Integer> smallList=getSmallList(bigList);
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
        System.out.println(smallList+""+smallList.size());
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList=new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num= bigList.get(i);
            if(num%2==0) smallList.add(num);
        }
        return smallList;
    }
}
