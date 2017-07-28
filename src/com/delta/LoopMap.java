package com.delta;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoopMap {
    public static void main(String[] args) {
        Map<String, Integer> mapKeySet = new HashMap<>();
        for (int i = 0; i < 20000; i++) {
            mapKeySet.put("key" + (i + 1), (i + 1));
        }

        Map<String, Integer> entryKeySet = new HashMap<>();
        for (int i = 0; i < 20000; i++) {
            entryKeySet.put("key" + (i + 1), (i + 1));
        }

        long keySetStartTime = System.currentTimeMillis();

        Iterator<String> keySetIterator = mapKeySet.keySet().iterator();
        while (keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            Integer value = mapKeySet.get(key);
        }

        System.out.println((System.currentTimeMillis()-keySetStartTime)+"");

        long entrySetStartTime = System.currentTimeMillis();
        Iterator<Map.Entry<String, Integer>> entrySetIterator = entryKeySet.entrySet().iterator();
        while (entrySetIterator.hasNext()) {
            Map.Entry<String, Integer> e = entrySetIterator.next();
            Integer value = e.getValue();
        }
        System.out.println((System.currentTimeMillis()-entrySetStartTime)+"");
    }
}
