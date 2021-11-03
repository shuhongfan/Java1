package com.shf7;

public class BankTest {
  public static void main(String[] args) {
    Bank bank=new Bank();
    bank.addCustomer("Jane","smith");
    bank.getCustomer(0).setAccount(new Account(2000));
    bank.getCustomer(0).getAccount().withdraw(500);
    double balance = bank.getCustomer(0).getAccount().getBalance();
    System.out.println("客户："+bank.getCustomer(0).getFirstName()+"的账户余额为："+balance);

    bank.addCustomer("万里","杨");
    System.out.println("银河客户的个数为："+bank.getNumberOfCustomers());
  }
}
