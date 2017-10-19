package com.delta.defaultTest.test6;

public interface D extends A, B {
    @Override
    default String say(int name) {
        return null;
    }
}
