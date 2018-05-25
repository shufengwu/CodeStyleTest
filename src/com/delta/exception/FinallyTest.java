package com.delta.exception;

public class FinallyTest {
    public static void main(String[] args) {
        System.out.println(getRes("12"));
    }

    public static int getRes(String src) {
        try {
            return string2Int(src);
        } finally {
            return 0;
        }
    }

    public static int string2Int(String src) {
        System.out.println("string2Int");
        return Integer.parseInt(src);
    }
}
