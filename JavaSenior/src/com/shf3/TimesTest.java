package com.shf3;

public class TimesTest {
  public static void main(String[] args) {
    String str="abkkcadkabkebfkabkskab";
    int times = getCount(str,"ab");
    System.out.println(times);
  }

  public static int times(String s,String key){
    int time=0;
    int index;
    for (int i = 0; i < s.length(); i++) {
      index = s.indexOf(key,i);
      if (index==-1) break;
      i=index+key.length();
      time++;
    }
    return time;
  }

  public static int getCount(String mainStr,String subStr){
    int mainLength=mainStr.length();
    int subLength=subStr.length();
    int count=0;
    int index=0;
    if (mainLength>=subLength){
//      while ((index=mainStr.indexOf(subStr))!=-1){
//        count++;
//        mainStr=mainStr.substring(index+subStr.length());
//      }
      while ((index=mainStr.indexOf(subStr,index))!=-1){
        count++;
        index+=subLength;
      }
      return count;
    }
    return 0;
  }
}
