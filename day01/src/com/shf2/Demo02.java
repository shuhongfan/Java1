package com.shf2;

public class Demo02 {
  public static void main(String[] args) {
    Phone p=new Phone();
    System.out.println(p);

    p.sendEmail();
    p.playGame();

    new Phone().sendEmail();
    new Phone().playGame();

    new Phone().price=1999;
    new Phone().showPrice();

    PhoneMall mall=new PhoneMall();
    mall.show(new Phone()); // 匿名对象的使用
  }
}


class PhoneMall{
  public void show(Phone phone){
    phone.sendEmail();
    phone.playGame();
  }
}


class Phone{
  double price;
  public void sendEmail(){
    System.out.println("发邮件");
  }

  public void playGame(){
    System.out.println("打游戏");
  }

  public void showPrice(){
    System.out.println("手机的价格为："+price);
  }
}
