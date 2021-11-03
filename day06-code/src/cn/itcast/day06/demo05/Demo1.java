package cn.itcast.day06.demo05;

public class Demo1 {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("当你");
        stu1.setAge(20);
        System.out.println(stu1.getName()+"----"+stu1.getAge());

        Student stu2=new Student("dsfs",22);
        stu2.setAge(33);
        System.out.println(stu2.getName()+"----"+stu2.getAge());
    }
}
