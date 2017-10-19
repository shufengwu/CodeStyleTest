package com.delta.defaultTest.test6;

public interface B {
    default String say(int name) {
        System.out.println("BBBBB");
        return "b " + name;
    }
}
