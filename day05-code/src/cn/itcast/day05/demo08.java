package cn.itcast.day05;

public class demo08 {
    public static void main(String[] args) {
        int[] arr={10,15,6,100,89};
        int i,t;
        for(i=0;i<arr.length/2;i++){
            t=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=t;
        }
        for(i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
