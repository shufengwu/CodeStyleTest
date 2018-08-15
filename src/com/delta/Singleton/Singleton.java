package com.delta.Singleton;

public class Singleton {
    private final static Singleton instance = new Singleton();

    //私有化构造器
    private Singleton() {
        System.out.println("构造方法");
    }

    //共有静态方法，对外暴露获取单例对象
    public static Singleton getInstance() {
        return instance;
    }
}
