package com.project2.view;

import com.project2.bean.Customer;
import com.project2.service.CustomerList;
import com.project2.util.CMUtility;

public class CustomerView {
  private CustomerList customerList=new CustomerList(10);

  public CustomerView(){
    Customer customer=new Customer("张三",'男',23,"133123123","wt@12.com");
    customerList.addCustomer(customer);
  }
//  菜单显示
  public void enterMainMenu(){
    boolean isFlag=true;
    while (isFlag){
      System.out.println("\n---------------------客户信息管理软件------------------------");
      System.out.println("\n                        1 添加客户");
      System.out.println("\n                        2 修改客户");
      System.out.println("\n                        3 删除客户");
      System.out.println("\n                        4 客户列表");
      System.out.println("\n                        5 退   出\n");
      System.out.println("\n                        请选择(1-5):");

      char menu = CMUtility.readMenuSelection();
      switch (menu){
        case '1':addNewCustomer();break;
        case '2':modifyCustomer();break;
        case '3':deleteCustomer();break;
        case '4':listAllCustomers();break;
        case '5':
          System.out.println("确认是否退出(Y/N):");
          char isExit=CMUtility.readConfirmSelection();
          if(isExit=='Y') isFlag=false;
      }
    }
  }

//  添加客户
  private void addNewCustomer(){
    System.out.println("---------------------添加客户------------------------");
    System.out.print("姓名:");
    String name = CMUtility.readString(10);
    System.out.print("性别:");
    char gender = CMUtility.readChar();
    System.out.print("年龄:");
    int age = CMUtility.readInt();
    System.out.print("电话:");
    String phone = CMUtility.readString(13);
    System.out.print("邮箱:");
    String email = CMUtility.readString(30);

    Customer newCu=new Customer(name,gender,age,phone,email);
    boolean isSuccess = customerList.addCustomer(newCu);
    if (isSuccess) System.out.println("---------------------添加成功------------------------");
    else System.out.println("---------------------客户目录已满,添加失败------------------------");
  }

//  修改客户
  private void modifyCustomer(){
    System.out.println("---------------------修改客户------------------------");
    Customer customer;
    int number;
    while (true){
      System.out.println("请选择修改客户编号(-1退出):");
      number = CMUtility.readInt();
      if (number==-1) return;
      customer = customerList.getCustomer(number-1);
      if (customer==null) System.out.println("无法找到指定客户!");
      else break;
    }

    System.out.print("姓名 ("+customer.getName()+"): ");
    String name = CMUtility.readString(10,customer.getName());
    System.out.print("性别 ("+customer.getGender()+"): ");
    char gender = CMUtility.readChar(customer.getGender());
    System.out.print("年龄 ("+customer.getAge()+"): ");
    int age = CMUtility.readInt(customer.getAge());
    System.out.print("电话 ("+customer.getPhone()+"): ");
    String phone = CMUtility.readString(13,customer.getPhone());
    System.out.print("邮箱 ("+customer.getEmail()+"): ");
    String email = CMUtility.readString(30,customer.getEmail());

    Customer newCust=new Customer(name,gender,age,phone,email);
    boolean isReplaced = customerList.replaceCustomer(number - 1, newCust);
    if (isReplaced)   System.out.println("---------------------修改成功------------------------");
    else    System.out.println("---------------------修改失败------------------------");
  }

//  删除客户
  private void deleteCustomer(){
    int number;
    System.out.println("---------------------删除客户------------------------");
    while (true){
      System.out.print("请选择待删除客户编号(-1退出)");
      number = CMUtility.readInt();
      if (number==-1) return;

      Customer customer=customerList.getCustomer(number-1);
      if (customer==null) System.out.println("无法找到客户");
      else break;
    }
    System.out.print("确认是否删除(Y/N)?");
    char isDelete = CMUtility.readConfirmSelection();
    if (isDelete == 'Y') {
      boolean deleteSuccess = customerList.deleteCustomer(number - 1);
      if (deleteSuccess)  System.out.println("---------------------删除成功------------------------");
      else  System.out.println("---------------------删除失败------------------------");
    } else return;
  }

//  显示所有客户信息
  private void listAllCustomers(){
    System.out.println("---------------------客户列表------------------------");
    if (customerList.getTotal()==0) System.out.println("没有客户记录");
    else {
      System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t\t邮箱");
      Customer[] allCustomer = customerList.getAllCustomer();
      for (int i = 0; i < allCustomer.length; i++) {
        Customer customer = allCustomer[i];
        System.out.println((i+1)+"\t\t"+customer.getName()+"\t\t"+customer.getGender()+"\t\t"+customer.getAge()+"\t\t"+customer.getPhone()+"\t\t"+customer.getEmail());
      }
    }
    System.out.println("-------------------客户列表完成------------------------");
  }

  public static void main(String[] args){
      CustomerView cv=new CustomerView();
      cv.enterMainMenu();
  }
}
