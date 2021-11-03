package com.shf16;

//默认初始化
//显示初始化、代码块中初始化
//构造器中初始化
//通过 对象.属性 或 对象.方法 的方式赋值

public class Demo01 {
  public static void main(String[] args) {
    Other o=new Other();
    new Demo01().addOne(o);
  }
  public void addOne(final Other o){
//    o=new Other();
    o.i++;
  }
}


class Other{
  public int i;
}
