package com.delta.defaultTest.test2;

public interface B {
    default void say(int name) {
        System.out.println("b " + name);
    }

    default void play() {
        System.out.println("B.play");
    }
}
