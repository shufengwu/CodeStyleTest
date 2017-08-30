package com.delta.defaultTest.test3;

public interface C extends A2, B {

    default void say(int name) {
        B.super.say(name);
        A2.super.say(name);
    }

}
