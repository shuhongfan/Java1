package demo01;

public class MyClass {
    int num;
    static int numStatic;
//    成员方法
    public void method(){
        System.out.println("这是一个成员方法");
        System.out.println(num);
        System.out.println(numStatic);
    }
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        System.out.println(numStatic);
//        System.out.println(this);

    }
}
