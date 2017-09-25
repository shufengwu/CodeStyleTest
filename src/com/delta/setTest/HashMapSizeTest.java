package com.delta.setTest;

import java.util.HashMap;

public class HashMapSizeTest {
    public static void main(String[] args) {
        //未设置初始值
        long start = System.currentTimeMillis();
        HashMap<String, String> map1 = new HashMap<>();
        for (int i = 0; i < 102400; i++) {
            map1.put("key" + i, i + "");
        }
        System.out.println((System.currentTimeMillis() - start) + "");

        //设置初始值
        long start2 = System.currentTimeMillis();
        HashMap<String, String> map2 = new HashMap<>(136540);
        for (int i = 0; i < 102400; i++) {
            map2.put("key" + i, i + "");
        }
        System.out.println((System.currentTimeMillis() - start2) + "");
    }
}
