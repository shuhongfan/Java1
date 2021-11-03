package com.shf15;

interface ClothFactory{
  void produceCloth();
}

class ProxyClothFactory implements ClothFactory{
  private ClothFactory factory; // 用被代理类进行实例化

  public ProxyClothFactory(ClothFactory factory){
    this.factory=factory;
  }

  @Override
  public void produceCloth() {
    System.out.println("代理工程做一些准备工作");
    factory.produceCloth();
    System.out.println("代理工厂做一些后续的收尾工作");
  }
}

class NikeClothFactory implements ClothFactory{

  @Override
  public void produceCloth() {
    System.out.println("Nike工厂生产一批运动服");
  }
}

//静态代理
public class StaticProxyTest {
  public static void main(String[] args) {
//    创建被代理类对象
    NikeClothFactory nikeClothFactory = new NikeClothFactory();
//    创建代理类的对象
    ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nikeClothFactory);

    proxyClothFactory.produceCloth();
  }
}
