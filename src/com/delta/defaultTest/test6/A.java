package com.delta.defaultTest.test6;

public interface A {
    default String say(int name) {
        System.out.println("AAAAA");
        return "a " + name;
    }
}
