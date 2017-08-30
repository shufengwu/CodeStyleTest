package com.delta.defaultTest.test5;

public interface A {
    default void say() {
        System.out.println("A");
    }
}
