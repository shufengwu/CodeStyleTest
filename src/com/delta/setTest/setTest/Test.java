package com.delta.setTest.setTest;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String[] a = new String[]{"12", "34", "56", "78", "90"};
        TestC testC = new TestC(a);
        testC.print1();
        a[0] = "21";
        testC.print1();
    }

    static class TestC {
        private String[] a;

        TestC(String[] array) {
            a = Objects.requireNonNull(array);
        }

        void print1() {
            System.out.println(a[0]);
        }
    }
}
