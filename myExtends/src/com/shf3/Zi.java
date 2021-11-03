package com.shf3;

public class Zi extends Fu{
    public Zi(){
        super(20);
        System.out.println("zi中 无 参构造方法被调用");
    }
    public Zi(int age){
        super(20);
        System.out.println("zi中 带 参构造方法被调用");
    }
}
