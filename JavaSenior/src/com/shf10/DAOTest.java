package com.shf10;

import java.util.List;

public class DAOTest {
  public static void main(String[] args) {
    DAO<User> dao=new DAO<>();
    dao.save("1001",new User(1001,34,"招商银行"));
    dao.save("1002",new User(1002,20,"工商银行"));
    dao.save("1003",new User(1003,25,"建设银行"));

    dao.update("1003",new User(1003,30,"农业银行"));

    List<User> list = dao.list();
//    System.out.println(list);
    list.forEach(System.out::println);
  }
}
