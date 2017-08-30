package com.delta.defaultTest.test3;

public interface A1 {
    default void say(int name) {
        System.out.println("a " + name);
    }
}
