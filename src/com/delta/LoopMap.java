package com.delta;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class LoopMap {
    public static void main(String[] args) {
        Map<String, Integer> mapKeySet = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            mapKeySet.put("key" + (i + 1), (i + 1));
        }

        Map<String, Integer> entryKeySet = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            entryKeySet.put("key" + (i + 1), (i + 1));
        }

        Map<String, Integer> foreachKeySet = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            foreachKeySet.put("key" + (i + 1), (i + 1));
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
            //String key = e.getKey();
            Integer value = e.getValue();
        }
        System.out.println((System.currentTimeMillis()-entrySetStartTime)+"");


        long foreachStartTime = System.currentTimeMillis();

        /*foreachKeySet.forEach((s, integer) -> {
            Integer value = integer;
        });*/

        foreachKeySet.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                Integer value = integer;
            }
        });

        System.out.println((System.currentTimeMillis() - foreachStartTime) + "");
    }
}
