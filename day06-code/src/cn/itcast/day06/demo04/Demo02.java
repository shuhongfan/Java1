package cn.itcast.day06.demo04;

public class Demo02 {
    public static void main(String[] args) {
        Student stu=new Student();
        Student stu2=new Student("dsfs",20);
        System.out.println("姓名："+stu2.getName()+",年龄："+stu2.getAge()+"岁");
        stu2.setAge(22);
        System.out.println(stu2.getAge());
    }
}
