package com.project3.team.service;

import com.project3.team.domain.Architect;
import com.project3.team.domain.Designer;
import com.project3.team.domain.Employee;
import com.project3.team.domain.Programmer;

public class TeamService {
  private static int counter=1;  //给memberId赋值使用
  private final int MAX_MEMBER=5; // 显示开发团队的人数
  private Programmer[] team=new Programmer[MAX_MEMBER]; // 保存开发团队成员
  private int total; //记录开发团队中实际的人数

  public TeamService(){}

//  获取开发团队的所有成员
  public Programmer[] getTeam(){
    Programmer[] team=new Programmer[total];
    for (int i = 0; i < team.length; i++) {
      team[i]=this.team[i];
    }
    return team;
  }

  public void addMember(Employee e) throws TeamException{
    if (total>=MAX_MEMBER) throw new TeamException("成员已满");
    if (!(e instanceof Programmer)) throw new TeamException("该成员不是开发人员,无法添加");
    if (isExist(e)) throw new TeamException("该成员已在开发团队中");

    Programmer p=(Programmer) e;
//    if (p.getStatus().getNAME().equals("BUSY")) throw new TeamException("该员工已是某团队成员");
//    else if ("VOCATION".equals(p.getStatus().getNAME())) throw new TeamException("该员工正在休假,无法添加");
    switch (p.getStatus()){
      case BUSY:throw new TeamException("该员工已是某团队成员");
      case VOCATION:throw new TeamException("该员工正在休假,无法添加");
    }

    int numOfArch=0,numOfDes=0,numOfPro=0;
    for (int i = 0; i < total; i++) {
      if (team[i] instanceof Architect) numOfArch++;
      else if (team[i] instanceof Designer) numOfDes++;
      else if (team[i] instanceof Programmer) numOfPro++;
    }
    if (p instanceof Architect) {
      if (numOfArch>=1) throw new TeamException("团队中至多只能有一名架构师");
    }else if (p instanceof Designer) {
      if (numOfDes>=2) throw new TeamException("团队中至多只能有二名架构师");
    } else if (p instanceof Programmer){
      if (numOfPro>=3) throw new TeamException("团队中至多只能有三名程序员");
    }
    p.setStatus(Status.BUSY);
    p.setMemberId(counter++);
    team[total++]=p;
  }

  private boolean isExist(Employee e) {
    for (int i = 0; i < total; i++) {
      return team[i].getId()==e.getId();
    }
    return false;
  }

  public void removeMember(int memberId) throws TeamException{
    int i;
    for (i = 0; i < total; i++) {
      if (team[i].getMemberId()==memberId) {
        team[i].setStatus(Status.FREE);
        break;
      }
    }
    if (i==total) throw new TeamException("找不到指定memberId的员工,删除失败");

    for (int j = i+1; j < total; j++) {
        team[j-1]=team[j];
    }
//    team[total-1]=null;
//    total--;
    team[--total]=null;
  }
}
