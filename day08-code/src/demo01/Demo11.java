package demo01;

public class Demo11 {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.method();

        MyClass.methodStatic();
        myMethod();
        Demo11.myMethod();
    }
    public static void myMethod(){
        System.out.println("自己的方法！！！");
    }
}
