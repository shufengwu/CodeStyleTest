package com.delta.defaultTest.test6;

public class C implements A, B {
    @Override
    public String say(int name) {
        return A.super.say(name);
    }
}
