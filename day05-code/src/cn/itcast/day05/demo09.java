package cn.itcast.day05;

public class demo09 {
    public static void main(String[] args) {
        int[] array={10,20,30,40};
        printArray(array);
        printArray(array);
    }
    public static void printArray(int[] array){
        System.out.println(array);
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }
}
