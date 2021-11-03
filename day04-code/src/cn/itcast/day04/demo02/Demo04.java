package cn.itcast.day04.demo02;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println("结果是："+sum());
    }
    public static int sum(){
        int i,sum=0;
        for(i=1;i<=100;i++)
            sum+=i;
        return sum;
    }
}
