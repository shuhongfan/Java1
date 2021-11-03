package demo01;

public class Demo10 {
    public static void main(String[] args) {
        Student one=new Student("A",19);
        one.room="101教室";
        Student two=new Student("B",16);
        System.out.println("姓名："+one.getName()+"，学号："+one.getId()+",年龄："+one.getAge()+"，教室："+one.room);
        System.out.println("姓名："+two.getName()+"，学号："+two.getId()+",年龄："+two.getAge()+"，教室："+two.room);
    }
}
