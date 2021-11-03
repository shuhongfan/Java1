package demo5;

import java.util.ArrayList;

public class Demo06 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student one=new Student("A",20);
        Student two=new Student("B",21);
        Student three=new Student("C",22);
        Student four=new Student("D",23);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.print(stu.getName());
            System.out.println(stu.getAge());
        }
    }
}
