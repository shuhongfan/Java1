package com.shf;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<>();
        while (true){
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    break;
            }
            if(line.equals("5")) System.exit(0);
        }
    }
    public static void addStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);
        String sid;
        while(true){
            System.out.println("请输入学生学号：");
            sid=sc.nextLine();
            boolean flag = isUsed(array, sid);
            if(flag){
                System.out.println("请输入的学号已经被使用，请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age=sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address=sc.nextLine();

        Student s=new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);
        System.out.println("添加学生成功");
    }
    public static void findAllStudent(ArrayList<Student> array){
        if(array.size()==0) {
            System.out.println("无信息，请先添加信息再查询！！！");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t"+s.getAddress());
        }
    }
    public static void deleteStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号:");
        String sid=sc.nextLine();

        int index=-1;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if(student.getSid().equals(sid)){
                index=i;
                break;
            }
        }
        if(index==-1) {
            System.out.println("该学号信息不存在，请重新输入：");
        } else {
            array.remove(index);
            System.out.println("删除学生成功");
        }

//        for(int i=0;i<array.size();i++){
//            Student s = array.get(i);
//            if(s.getSid().equals(sid)) {
//                array.remove(i);
//                break;
//            }
//        }
    }
    public static void updateStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要修改学生的学号：");
        String sid = sc.nextLine();
        System.out.println("请输入学生的新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生的新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生的新居住地：");
        String address = sc.nextLine();

        Student s=new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        int index=-1;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if(student.getSid().equals(sid)){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("学生学号不存在，请重新输入");
        } else {
            array.set(index,s);
            System.out.println("修改学生成功");
        }

//        for(int i=0;i<array.size();i++){
//            Student student = array.get(i);
//            if(student.getSid().equals(sid)){
//                array.set(i,s);
//                break;
//            }
//        }
    }
    public static boolean isUsed(ArrayList<Student> array,String sid){
        boolean flag=false;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if(student.getSid().equals(sid)){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
