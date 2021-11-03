import java.util.Scanner;

public class J5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高：");
        int h1= sc.nextInt();
        System.out.println("请输入第二个和尚的身高：");
        int h2= sc.nextInt();
        System.out.println("请输入第三个和尚的身高：");
        int h3= sc.nextInt();
        int tempHeight=h1>h2?h1:h2;
        int maxHeight=tempHeight>h3?tempHeight:h3;
        System.out.println("最高身高是："+maxHeight+"cm");
    }
}
