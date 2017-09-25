package com.delta.setTest;

import java.util.ArrayList;

public class SubListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.add("g");
        System.out.println(arrayList);
        /*List<String> subList = arrayList.subList(2, 4);
        System.out.println(subList);*/
        arrayList.subList(2, 4).remove(0);
        System.out.println(arrayList);
    }
}
