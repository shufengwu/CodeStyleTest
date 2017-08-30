package com.delta.defaultTest.test2;

public interface C extends A, B {
    @Override
    default void say(int name) {
        System.out.println("C.say");
    }

}
