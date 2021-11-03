package demo02;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        String str="sgsgwhig90oiwf46sdgsdgdsgd5s";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
