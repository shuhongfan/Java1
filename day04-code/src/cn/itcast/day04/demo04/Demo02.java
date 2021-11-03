package cn.itcast.day04.demo04;

public class Demo02 {
    public static void main(String[] args) {
        byte a=10,b=20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)20,(short)20));
    }
    public static boolean isSame(byte a,byte b){
        boolean same;
        if(a==b) same=true;
        else same=false;
        return same;
    }
    public static boolean isSame(byte a,int b){
        boolean same=a==b?true:false;
        return same;
    }
    public static boolean isSame(int a,int b){
        return a==b;
    }
}
