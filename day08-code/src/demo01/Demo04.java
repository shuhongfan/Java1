package demo01;

public class Demo04 {
    public static void main(String[] args) {
        int length = "dsgergrehqegrhytukiuydgfsbhngfj".length();
        System.out.println(length);

        String str1="Hello";
        String str2="World";
        String str3=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        char c = "Hello".charAt(1);
        System.out.println(c);

        String original="HelloWorldHelloWorldHelloWorld";
        int index = original.indexOf("llo1");
        System.out.println(index);


    }
}
