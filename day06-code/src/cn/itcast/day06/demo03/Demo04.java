package cn.itcast.day06.demo03;

public class Demo04 {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);
        System.out.println("姓名："+stu.getName());
        System.out.println("年龄："+stu.getAge());
        System.out.println("性别："+stu.isMale());
    }
}
