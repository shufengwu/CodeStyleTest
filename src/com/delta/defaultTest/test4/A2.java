package com.delta.defaultTest.test4;

interface A2 extends A1 {
    default void say() {
        System.out.println("A2");
    }
}
