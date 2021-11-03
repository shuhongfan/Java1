package com.project1;

public class FamilyAccount {
  public static void main(String[] args) {
    boolean isFlag = true;
    String details = "收支\t\t\t\t账户余额\t\t\t\t收支金额\t\t\t\t说   明";
    int balance = 10000;

    while (isFlag){
      System.out.println("--------------------家庭收支记账软件-----------------------------");
      System.out.println("                       1  收支明细");
      System.out.println("                       2  登记收入");
      System.out.println("                       3  登记支出");
      System.out.println("                       4  退   出");
      System.out.println("                      请选择（ 1 - 4 ）");
      System.out.println("--------------------------------------------------------------");

      char selection = Utility.readMenuSelection();
      switch (selection){
        case '1':
          System.out.println("--------------------当前收支明细记录-----------------------------");
          System.out.println("                    当前余额为："+balance);
          System.out.println(details);
          System.out.println("--------------------------------------------------------------");
          break;
        case '2':
          System.out.print("本次收入金额：");
          int money = Utility.readNumber();
          System.out.print("本次收入说明：");
          String info = Utility.readString();

          balance+=money;
          details+="\n收入\t\t\t\t"+balance+"\t\t\t\t"+money+"\t\t\t\t"+info;

          System.out.println("------------------------登记完成-------------------------------");
          break;
        case '3':
          System.out.print("本次支出金额：");
          int money1 = Utility.readNumber();
          System.out.print("本次支出说明：");
          String info1 = Utility.readString();

          if(balance>=money1) balance-=money1;
          else System.out.println("支出超出账户额度，支付失败");
          details+="\n支出\t\t\t\t"+balance+"\t\t\t\t"+money1+"\t\t\t\t"+info1;

          System.out.println("------------------------登记完成-------------------------------");
          break;
        case '4':
          System.out.println("是否确认推出（Y / N）？");
          char isExit = Utility.readConfirmSelection();
          if (isExit=='Y') isFlag=false;
          break;
      }
    }
  }
}
