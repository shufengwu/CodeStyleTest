package com.delta.HashCodeTest;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //
        Set set = new HashSet();
        //set.add(new )
    }
}

class A {

    private int id;

    public A(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((A) obj).id;
    }
}

class B {
    @Override
    public int hashCode() {
        return 1;
    }
}

class C {
    private int id;

    public C(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((C) obj).id;
    }

    @Override
    public int hashCode() {
        return 2;
    }
}
