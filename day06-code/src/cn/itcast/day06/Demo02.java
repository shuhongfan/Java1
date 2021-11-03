package cn.itcast.day06;

public class Demo02 {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.brand="Apple";
        one.price=8388.0;
        one.color="Black";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        one.call("乔布斯");
        one.sendMessage();

        Phone two=one;
        two.brand="三星";
        two.price=5999.0;
        two.color="Blue";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        two.call("欧巴");
        two.sendMessage();
    }
}
