package com.shf21;

//自定义异常
public class EcDef extends Exception{
  static final long SerialVersionUID=-3354564834758L;

  public EcDef(){

  }

  public EcDef(String msg){
    super(msg);
  }
}
