package com.project2.service;

import com.project2.bean.Customer;

public class CustomerList {
  private Customer[] customers;
  private int total=0;  // 客户数量

//  初始化customer数组
  public CustomerList(int totalCustomer){
    customers=new Customer[totalCustomer];
  }

//  将指定的客户 添加到数组中
  public boolean addCustomer(Customer customer){
    if (total>=customers.length) return false;
    customers[total]=customer;
    total++;
    return true;
  }

//  修改指定位置上的客户信息
  public boolean replaceCustomer(int index,Customer cust){
    if (index<0||index>=total) return false;
    customers[index]=cust;
    return true;
  }

//  删除指定客户的信息
  public boolean deleteCustomer(int index){
    if (index<0||index>=total) return false;
    for (int i = index; i < total-1; i++) {
      customers[i]=customers[i+1];
    }
//    customers[total-1]=null;
//    total--;
//    或
    customers[--total]=null;
    return true;
  }

//  获取所有客户信息
  public Customer[] getAllCustomer(){
    Customer[] cuts=new Customer[total];
    for (int i = 0; i < total; i++) {
      cuts[i]=customers[i];
    }
    return cuts;
  }

//  获取指定位置上的客户
  public Customer getCustomer(int index){
    if (index<0||index>=total) return null;
    return customers[index];
  }

//  获取客户数量
  public int getTotal(){
    return total;
  }
}
