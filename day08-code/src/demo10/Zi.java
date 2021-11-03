package demo10;

public class Zi extends Fu{
    int num=20;
    @Override
    public void method(){
        super.method();
        int num=30;
        System.out.println("子类方法");
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
