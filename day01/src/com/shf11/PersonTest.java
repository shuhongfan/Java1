package com.shf11;

public class PersonTest {
  public static void main(String[] args) {
    Person p1=new Person();
    p1.eat();

    Man man=new Man();
    man.eat();
    man.age=25;
    man.earnMoney();

//    多态：一个事务的多种形态
//    对象的多态性：父类的引用指向子类的对象  子类的对象赋给父类的引用
//    编译：看左边    运行：看右边
    Person p2=new Man();
//    多态的使用：当调用父类同名参数的方法时，实际执行的是子类重写父类的方法
    p2.eat();
    p2.walk();
//    p2.earnMoney();
    System.out.println(p2.id);

    Man m1=(Man) new Person();
    m1.earnMoney();
    m1.siSmoking=true;

  }
}
