package cn.itcast.day06.demo03;

public class Demo02 {
    public static void main(String[] args) {
        int[] array={5,15,25,20,100};
        System.out.println(getMax(array));
    }
    public static int getMax(int[] array){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max) max=array[i];
        }
        return max;
    }
}
