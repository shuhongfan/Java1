package cn.itcast.day06.demo04;

public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("无参数构造方法执行啦");
    }
    public Student(String name,int age){
        System.out.println("全参数构造方法执行啦");
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
