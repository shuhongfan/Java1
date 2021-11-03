import java.util.Random;
import java.util.Scanner;

public class J22 {
    public static void main(String[] args) {
        Random r=new Random();
        int number= r.nextInt(100);
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        while(true){
            if(number>num) System.out.println("猜小了");
            else if(number<num) System.out.println("猜大了");
            else {
                System.out.println("猜对了");
                break;
            }
            num= sc.nextInt();
        }
    }
}
