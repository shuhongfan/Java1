package com.shf6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ListExer {
  @Test
  public void testListRemove(){
    ArrayList arrayList = new ArrayList();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    updateList(arrayList);
    System.out.println(arrayList);
  }
  private void updateList(List list){
    list.remove(new Integer(2));
    list.remove(2);
  }
}
