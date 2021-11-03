package cn.itcast.day04.demo02;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(20,20));
    }
    public static boolean isSame(int a,int b){
//        boolean same;
//        if(a==b){
//            same=true;
//        } else {
//            same=false;
//        }
//        same=a==b?true:false;
//        boolean same=a==b;
//        return same;
        return a==b;
    }
}
