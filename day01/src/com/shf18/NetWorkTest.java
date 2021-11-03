package com.shf18;

public class NetWorkTest {
  public static void main(String[] args) {
    new ProxyServer(new Server()).browse();
  }
}

interface NetWork{
  public void browse();
}

class Server implements NetWork{
  @Override
  public void browse() {
    System.out.println("真实的服务器访问网络");
  }
}

class ProxyServer implements NetWork{
  private NetWork work;
  public ProxyServer(NetWork work){
    this.work=work;
  }
  public void check(){
    System.out.println("联网之前的检查工作");
  }
  @Override
  public void browse() {
    check();
    work.browse();
  }
}
