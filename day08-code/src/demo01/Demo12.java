package demo01;

public class Demo12 {
    public static void main(String[] args) {
        Student.room="101教室";
        Student one=new Student("A",20);
        System.out.println(one.getName());
        System.out.println(one.getAge());
        System.out.println(Student.room);
        System.out.println(one.room);

        Student two=new Student("B",18);
        System.out.println(two.getName());
        System.out.println(two.getAge());
        System.out.println(Student.room);
        System.out.println(two.room);
    }
}
