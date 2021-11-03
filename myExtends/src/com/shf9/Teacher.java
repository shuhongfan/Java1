package com.shf9;

public class Teacher extends Person{
    public void teach(){
        System.out.println("用爱成就每一位学员");
    }
    public Teacher(String name,int age){
        super(name,age);
    }
    public Teacher(){}
}
