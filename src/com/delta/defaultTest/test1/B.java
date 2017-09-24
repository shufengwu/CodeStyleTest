package com.delta.defaultTest.test1;

public interface B {
    default String say(int name) {
        System.out.println("int");
        return "b " + name;
    }
}
