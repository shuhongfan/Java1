package com.shf8;

public class Demo {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setName("张三");
        t1.setAge(18);
        System.out.println(t1.getName()+", "+t1.getAge());
        t1.teach();

        Teacher t2=new Teacher("李四",33);
        System.out.println(t2.getName()+", "+t2.getAge());
        t2.teach();
    }
}
