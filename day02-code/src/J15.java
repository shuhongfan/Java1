public class J15 {
    public static void main(String[] args) {
        int count=0,ge,shi,bai;
        for (int i = 100; i < 1000; i++) {
            ge=i%10;
            shi=i/10%10;
            bai=i/100;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i)
                count++;
        }
        System.out.println(count);
    }
}
