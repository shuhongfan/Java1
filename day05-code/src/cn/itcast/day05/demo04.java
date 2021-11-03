package cn.itcast.day05;

public class demo04 {
    public static void main(String[] args) {
        int[] array=new int[3];
        array[1]=10;
        array[2]=20;
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);


        int[] arrayB=array;
        arrayB[1]=100;
        arrayB[2]=200;
        System.out.println(arrayB);
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
    }
}
