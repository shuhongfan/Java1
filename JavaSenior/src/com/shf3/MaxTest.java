package com.shf3;

public class MaxTest {
  public static void main(String[] args) {
    String str1="abcwerthelloyuiodef";
    String str2="cvhellobnmiodef";
    String maxSameString = getMaxSameString(str1, str2);
    System.out.println(maxSameString);
  }

  public static String getMaxSameString(String s1,String s2){
    String max = (s1.length() >= s2.length()) ? s1 : s2;
    String min = (s1.length() < s2.length()) ? s1 : s2;
    int minLength = min.length();
    for (int i = 0; i < minLength; i++) {
      for (int x = 0,y=minLength-i; y <= minLength ; x++,y++) {
        String subStr = min.substring(x, y);
        System.out.println("x="+x+",y="+y+",str="+subStr);
        if (max.contains(subStr)) return subStr;
      }
    }
    return null;
  }

  public static String getMaxSameString2(String s1,String s2){
    String max=(s1.length()>=s2.length())?s1:s2;
    String min=(s1.length()<s2.length())?s1:s2;
    int length = min.length();
    for (int i = 0; i < length; i++) {
      for (int start = 0, end = length - i; end <= length; start++, end++) {
        String subStr = min.substring(start, end);
        if (max.contains(subStr)) return subStr;
      }
    }
    return null;
  }

  public static String[] getMaxSameString3(String s1,String s2){
    StringBuffer buffer = new StringBuffer();
    String max = s1.length() > s2.length() ? s1 : s2;
    String min = s1.length() < s2.length() ? s1 : s2;
    int length = min.length();
    for (int i = 0; i < length; i++) {
      for (int start = 0,end=length-i; end <=length ; start++,end++) {
        String substring = min.substring(start, end);
        if (max.contains(substring)) buffer.append(substring+",");
      }
      if (buffer.length()!=0) break;
    }
    String[] split = buffer.toString().replaceAll(",$", "").split("\\,");
    return split;
  }
}
