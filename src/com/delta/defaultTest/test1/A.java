package com.delta.defaultTest.test1;

public interface A {
    default String say(short name) {
        System.out.println("short");
        return "a " + name;
    }
}
