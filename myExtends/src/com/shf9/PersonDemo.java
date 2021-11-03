package com.shf9;

public class PersonDemo {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setAge(18);
        t1.setName("张三");
        System.out.println(t1.getName()+", "+t1.getAge());
        t1.teach();

        Teacher t2=new Teacher("风清扬",33);
        System.out.println(t2.getName()+", "+t2.getAge());
    }
}
