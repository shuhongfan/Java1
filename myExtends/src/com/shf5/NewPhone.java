package com.shf5;

public class NewPhone extends Phone{
//    方法重写
    @Override
    public void call(String name){
        System.out.println("开始视频功能");
//        System.out.println("给 "+name+" 打电话");
        super.call(name);
    }
}
