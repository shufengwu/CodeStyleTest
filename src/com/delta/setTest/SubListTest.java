package com.delta.setTest;

import java.util.ArrayList;
import java.util.List;

public class SubListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("abc");
        arrayList.add("bcd");
        arrayList.add("cde");
        arrayList.add("def");
        arrayList.add("efg");
        arrayList.add("fgh");
        arrayList.add("ghi");
        List subList = arrayList.subList(2, 5);
        System.out.println(subList);
    }
}
