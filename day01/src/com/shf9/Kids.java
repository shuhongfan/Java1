package com.shf9;

public class Kids extends ManKind{
  private int yearsOld;

  public void printAge(){
    System.out.println("I am "+yearsOld+" years old.");
  }

  public Kids() {
  }

  public Kids(int yearsOld) {
    this.yearsOld = yearsOld;
  }

  public int getYearsOld() {
    return yearsOld;
  }

  public void setYearsOld(int yearsOld) {
    this.yearsOld = yearsOld;
  }

  @Override
  public void employeed() {
    System.out.println("kids should study");
  }
}
