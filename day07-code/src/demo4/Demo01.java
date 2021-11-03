package demo4;

public class Demo01 {
    public static void main(String[] args) {
        Person[] array=new Person[3];
        System.out.println(array[0]);

        Person one=new Person("迪丽热巴",18);
        Person two=new Person("sdf",128);
        Person three=new Person("的",38);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0]);

        System.out.println(array[1].getName());
    }
}
