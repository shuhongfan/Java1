package demo2;

public class Demo03 {
    public static void main(String[] args) {
        Person one=new Person();
        one.name="高圆圆";
        one.showName();

        new Person().name="hahaha";
        new Person().showName();
    }
}
