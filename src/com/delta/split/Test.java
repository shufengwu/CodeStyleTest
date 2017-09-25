package com.delta.split;

public class Test {
    public static void main(String[] args) {
        String str = "a,b,c,,";
        String[] arr = str.split(",");
        System.out.println(arr[2]);
    }
}
