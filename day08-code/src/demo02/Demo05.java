package demo02;

public class Demo05 {
    public static void main(String[] args) {
        int count=0;
        for(int i=(int)-10.8;i<=(int)(5.9);i++){
            int abs=Math.abs(i);
            if(abs>6||abs<2.1) {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("总共有"+count);
    }
}
