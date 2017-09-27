package com.delta;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class LoopMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 5000000; i++) {
            map.put("key" + (i + 1), (i + 1));
        }


        /**
         * keySet遍历
         */
        //开始时刻
        long keySetStartTime = System.currentTimeMillis();
        Iterator<String> keySetIterator = map.keySet().iterator();
        while (keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            Integer value = map.get(key);
        }
        //时长
        System.out.println((System.currentTimeMillis()-keySetStartTime)+"");

        /**
         * entrySet遍历
         */
        //开始时刻
        long entrySetStartTime = System.currentTimeMillis();
        Iterator<Map.Entry<String, Integer>> entrySetIterator = map.entrySet().iterator();
        while (entrySetIterator.hasNext()) {
            Map.Entry<String, Integer> e = entrySetIterator.next();
            //String key = e.getKey();
            Integer value = e.getValue();
        }
        //时长
        System.out.println((System.currentTimeMillis()-entrySetStartTime)+"");


        /**
         * map.forEach遍历
         */
        //开始时刻
        long foreachStartTime = System.currentTimeMillis();

        /*foreachKeySet.forEach((s, integer) -> {
            Integer value = integer;
        });*/

        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                Integer value = integer;
            }
        });

        //时长
        System.out.println((System.currentTimeMillis() - foreachStartTime) + "");
    }
}
