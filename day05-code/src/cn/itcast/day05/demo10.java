package cn.itcast.day05;

public class demo10 {
    public static void main(String[] args) {
        int[] result=cal(10,20,30);
        System.out.println("求和："+result[0]);
        System.out.println("平均："+result[1]);
    }
    public static int[] cal(int a,int b,int c){
//        int[] array=new int[2];
//        array[0]=a+b+c;
//        array[1]=array[0]/3;
        int sum=a+b+c;
        int avg=sum/3;
        int[] array={sum,avg};
        return array;
    }
}
