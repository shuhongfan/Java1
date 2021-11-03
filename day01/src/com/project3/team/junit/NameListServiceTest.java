package com.project3.team.junit;

import com.project3.team.domain.Employee;
import com.project3.team.service.NameListService;
import com.project3.team.service.TeamException;

public class NameListServiceTest {
  public static void main(String[] args) {
    NameListService service=new NameListService();
    Employee[] allEmployees = service.getAllEmployees();
    for (int i = 0; i < allEmployees.length; i++) {
      System.out.println(allEmployees[i]);
    }

    try {
      Employee employee = service.getEmployee(55);
      System.out.println(employee);
    } catch (TeamException e) {
      System.out.println(e.getMessage());
    }
  }
}
