package com.delta.setTest;

import java.util.ArrayList;
import java.util.List;

public class SubListTest {
    int a = 0;
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

        List<String> subList = arrayList.subList(2, 4);
        System.out.println(subList);

        subList.remove(0);
        System.out.println(subList.toString());

        System.out.println(arrayList);
    }
}
