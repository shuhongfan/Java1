package demo02;

public class Person {
    static {
        System.out.println("静态代码区执行");
    }
    public Person(){
        System.out.println("构造方法执行");
    }
}
