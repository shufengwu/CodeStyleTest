package com.delta.defaultTest.test2;

public interface A {
    default void say(int name) {
        System.out.println("a " + name);
    }

    default void run() {
        System.out.println("A.run");
    }
}
