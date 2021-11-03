package com.shf10;

public class CheckAccount extends Account{
  private double overdraft;

  public CheckAccount(int id, double balance, double annualInterestRate,double overdraft){
    super(id, balance, annualInterestRate);
    this.overdraft=overdraft;
  }

  public double getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(double overdraft) {
    this.overdraft = overdraft;
  }

  //  取钱
  @Override
  public void withdraw(double amount) {
    if (getBalance()>=amount) {
//      setBalance(getBalance()-amount);
      super.withdraw(amount);
    } else if (overdraft>= amount-getBalance()){
      double balance = getBalance();
      super.withdraw(balance);
      overdraft-=(amount-balance);
    } else{
      System.out.println("余额不足");
    }
  }
}
