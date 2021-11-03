package demo04;

public class Zi extends Fu{
    int num=20;
    public void method1(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    public void methodZi(){
        System.out.println("子类方法执行");
    }
    public void method(){
        System.out.println("子类重名方法执行");
    }
}
