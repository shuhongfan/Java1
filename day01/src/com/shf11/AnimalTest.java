package com.shf11;

public class AnimalTest {
  public static void main(String[] args) {
    AnimalTest test=new AnimalTest();
    test.func(new Dog());
    test.func(new Cat());
  }
  public void func(Animal animal){
    animal.eat();
    animal.shout();
  }
}

class Animal{
  public void eat(){
    System.out.println("动物：进食");
  }

  public void shout(){
    System.out.println("动物：叫");
  }
}

class Dog extends Animal{
  public void eat(){
    System.out.println("狗吃骨头");
  }
  public void shout(){
    System.out.println("旺旺旺");
  }
}
class Cat extends Animal{
  public void eat(){
    System.out.println("猫吃鱼");
  }
  public void shout(){
    System.out.println("喵喵喵");
  }
}
