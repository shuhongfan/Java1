package com.shf18;

public class USBTest {
  public static void main(String[] args) {
    Computer computer = new Computer();

    Flash flash = new Flash();
    Printer printer = new Printer();
    computer.transferDate(flash);
    computer.transferDate(printer);

    computer.transferDate(new Flash());
    computer.transferDate(new Printer());

    USB Phone=new USB() {
      @Override
      public void start() {
        System.out.println("手机开始工作");
      }

      @Override
      public void stop() {
        System.out.println("手机结束工作");
      }
    };
    computer.transferDate(Phone);

    computer.transferDate(new USB() {
      @Override
      public void start() {
        System.out.println("MP3开始工作");
      }

      @Override
      public void stop() {
        System.out.println("MP3结束工作");
      }
    });
  }
}

class Computer{
  public void transferDate(USB usb){
    usb.start();
    System.out.println("具体细节");
    usb.stop();
  }
}

interface USB{
  void start();
  void stop();
}

class Flash implements USB{

  @Override
  public void start() {
    System.out.println("U盘开始工作");
  }

  @Override
  public void stop() {
    System.out.println("U盘结束工作");
  }
}


class Printer implements USB{

  @Override
  public void start() {
    System.out.println("打印机开始工作");
  }

  @Override
  public void stop() {
    System.out.println("打印机结束工作");
  }
}