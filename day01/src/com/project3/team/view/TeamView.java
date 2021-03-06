package com.project3.team.view;

import com.project3.team.domain.Employee;
import com.project3.team.domain.Programmer;
import com.project3.team.service.NameListService;
import com.project3.team.service.TeamException;
import com.project3.team.service.TeamService;

public class TeamView {
  private NameListService listSvc=new NameListService();
  private TeamService teamSvc=new TeamService();

  public void enterMainMenu(){
    boolean lookFlag=true;
    char menu=0;
    while (lookFlag){
      if (menu!='1') listAllEmployees();
      System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员  4-退出  请选择(1-4):");
      menu = TSUtility.readMenuSelection();
      switch (menu){
        case '1': getTeam();break;
        case '2': addMember();break;
        case '3': deleteMember();break;
        case '4':
          System.out.print("确认是否退出(Y/N):");
          char isExit = TSUtility.readConfirmSelection();
          if (isExit=='Y') {
            lookFlag=false;
            System.out.println("---------------------------退出成功，欢迎再次使用----------------------------");
          }
      }
    }
  }
//  显示所有员工信息
  private void listAllEmployees(){
    System.out.println("-------------------------------开发团队调度软件-------------------------------");
    Employee[] allEmployees = listSvc.getAllEmployees();
    if (allEmployees==null || allEmployees.length==0) System.out.println("公司中没有任何员工信息");
    else {
      System.out.println("ID\t姓 名\t年龄\t工 资\t职 位\t状 态\t奖 金\t股 票\t领用设备");
      for (int i = 0; i < allEmployees.length; i++) {
        System.out.println(allEmployees[i]);
      }
      System.out.println("-------------------------------------------------------------------------");
    }
  }
  private void getTeam(){
    System.out.println("-------------------------------团队成员列表--------------------------------");
    Programmer[] team = teamSvc.getTeam();
    if (team==null || team.length==0) System.out.println("开发团队目前没有成员！");
    else {
      System.out.println("TID/ID\t姓 名\t年龄\t工 资\t职 位\t奖 金\t股 票");
      for (int i = 0; i < team.length; i++) {
        System.out.println(team[i].getDetailsForTeam());
      }
    }
    System.out.println("-------------------------------------------------------------------------");
  }
  private void addMember(){
    System.out.println("-------------------------------添加成员--------------------------------");
    System.out.print("请输入要添加的员工ID：");
    int id = TSUtility.readInt();
    Employee employee = null;
    try {
      employee = listSvc.getEmployee(id);
      teamSvc.addMember(employee);
      System.out.println("添加成功！");
    } catch (TeamException e) {
      System.out.println("添加失败，原因："+e.getMessage());
    }
    TSUtility.readReturn(); // 按回车继续
  }
  private void deleteMember(){
    System.out.println("-------------------------------添加成员--------------------------------");
    System.out.println("请输入要删除员工的TID：");
    int Tid = TSUtility.readInt();
    System.out.print("确认是否删除（Y / N）？");
    char isDelete = TSUtility.readConfirmSelection();
    if (isDelete=='N') return;
    try {
      teamSvc.removeMember(Tid);
      System.out.println("删除成功！");
    } catch (TeamException e) {
      System.out.println("删除失败，原因："+e.getMessage());
    }
    TSUtility.readReturn();
  }

  public static void main(String[] args) {
    TeamView view=new TeamView();
    view.enterMainMenu();
  }
}
