package com.shf15;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human{
  String getBelief();
  void eat(String food);
}

//被代理类
class SuperMan implements Human{

  @Override
  public String getBelief() {
    return "I believe I can Fly!";
  }

  @Override
  public void eat(String food) {
    System.out.println("我喜欢吃"+food);
  }
}

class ProxyFactory{
//  调用此方法，返回一个代理类的对象
  public static Object getProxyInstance(Object obj){
    MyInvocationHandler handler = new MyInvocationHandler();
    handler.bind(obj);
    return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
  }
}

class MyInvocationHandler implements InvocationHandler{
  private Object obj;
  public void bind(Object obj){
    this.obj=obj;
  }
//  通过代理类的对象，调用方法a时，就会自动的调用如下的的方法 invoke
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object invoke = method.invoke(obj, args);
    return invoke;
  }
}

//动态代理
public class ProxyTest {
  public static void main(String[] args) {
    SuperMan superMan = new SuperMan();
//    proxyInstance  代理类对象
    Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
    String belief = proxyInstance.getBelief();
    System.out.println(belief);
    proxyInstance.eat("重庆小面");

    NikeClothFactory nikeClothFactory = new NikeClothFactory();
    ClothFactory proxyInstance1 = (ClothFactory) ProxyFactory.getProxyInstance(nikeClothFactory);
    proxyInstance1.produceCloth();
  }
}
