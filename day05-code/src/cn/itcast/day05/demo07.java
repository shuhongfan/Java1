package cn.itcast.day05;

public class demo07 {
    public static void main(String[] args) {
        int[] array={5,15,30,20,10000};
        int max=array[0];
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]) max=array[i];
            if(min>array[i]) min=array[i];
        }
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
    }
}
