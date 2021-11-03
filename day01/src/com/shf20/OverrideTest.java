package com.shf20;

import java.io.IOException;

public class OverrideTest {
    public void display(SuperClass s){
      try{
        s.method();
      }catch (IOException e){
        e.printStackTrace();
      }
    }
}

class SuperClass{
  public void method() throws IOException{

  }
}

class SubClass extends SuperClass{
  public void method() throws IOException{

  }
}
