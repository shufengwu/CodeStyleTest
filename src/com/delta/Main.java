package com.delta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("2");
        a.add("1");
        for (String temp : a) {
            if ("1".equals(temp)) {
                a.remove(temp);
            }
        }
    }
}
