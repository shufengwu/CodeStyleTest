package com.delta.defaultTest.test3;

public interface B {
    default void say(int name) {
        System.out.println("a " + name);
    }
}
