package demo01;

public class Demo01 {
    public static void main(String[] args) {
        String str1=new String();
        System.out.println(str1);

        char[] charArray={'A','B','C'};
        String str2=new String(charArray);
        System.out.println(str2);

        byte[] byteArray={65,66,67};
        String str3=new String(byteArray);
        System.out.println(str3);

        String str4="Hello";
        System.out.println(str4);
    }
}
