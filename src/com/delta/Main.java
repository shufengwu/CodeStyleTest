package com.delta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<String> a1 = new ArrayList<>();
        a1.add("1");
        a1.add("2");
        a1.add("3");
        a1.add("4");
        a1.add("5");
        int len=a1.size();
        for (int i=0;i<len;i++) {
            if ("3".equals(a1.get(i))) {
                a1.remove(i);
                //增加
                //len--;
                //i--;
            }
        }*/

        /*System.out.println("size: " + a1.size());
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }*/

        List<String> a2 = new ArrayList<>();
        a2.add("1");
        a2.add("2");

        for (String a : a2) {
            System.out.println(a);
            if ("2".equals(a)) {
                a2.remove(a);
            }
        }

        System.out.println("size: " + a2.size());
        for (int i = 0; i < a2.size(); i++) {
            System.out.println(a2.get(i));
        }

        /*List<String> a3 = new ArrayList<>();
        a3.add("1");
        a3.add("2");
        Iterator<String> it = a3.iterator();
        while (it.hasNext()) {
            String x = it.next();
            System.out.println(x);
            if (x.equals("1")) {
                it.remove();
            }
        }

        System.out.println("size: " + a3.size());
        for (int i = 0; i < a3.size(); i++) {
            System.out.println(a3.get(i));
        }*/




    }
}
