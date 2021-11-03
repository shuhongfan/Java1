package com.shf4;

public class SeasonTest1 {
  public static void main(String[] args) {
    Season1 summer = Season1.SUMMER;
    System.out.println(summer);

    System.out.println(Season1.class.getSuperclass());
    Season1[] values = Season1.values();
    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
      values[i].show();
    }

    Season1 winter = Season1.valueOf("WINTER");
    System.out.println(winter);
  }
}

interface Info{
  void show();
}

enum Season1 implements Info {
  SPRING("春天","春暖花开"){
    @Override
    public void show() {
      System.out.println("春天在哪里？");
    }
  },
  SUMMER("夏天","夏日炎炎"){
    @Override
    public void show() {
      System.out.println("夏天在哪里？");
    }
  },
  AUTUMN("秋天","秋高气爽"){
    @Override
    public void show() {
      System.out.println("秋天不回来");
    }
  },
  WINTER("冬天","冰天雪地"){
    @Override
    public void show() {
      System.out.println("冬天不会来");
    }
  };

  private final String name;
  private final String desc;

  private Season1(String name, String desc) {
    this.name = name;
    this.desc = desc;
  }

  public String getName() {
    return name;
  }

  public String getDesc() {
    return desc;
  }

  @Override
  public String toString() {
    return "Season1{" +
            "name='" + name + '\'' +
            ", desc='" + desc + '\'' +
            '}';
  }
}
