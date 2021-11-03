package demo03;

public class Demo02 {
    public static void main(String[] args) {
        Fu fu=new Fu();
        System.out.println(fu.numFu);
        System.out.println(fu.num);
//        System.out.println(fu.numZi);
        System.out.println("================");
        Zi zi=new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println(zi.num);
        zi.methodZi();
        zi.methodFu();
    }
}
