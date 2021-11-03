package cn.itcast.day06;

public class Demo01 {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.name="SHDF";
        stu.age=18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.eat();
        stu.study();
        stu.sleep();
    }
}
