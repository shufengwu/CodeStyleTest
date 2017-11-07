package com.delta.exception;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class SetNullTest {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = null;
        String s3 = null;
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(CollectionUtils.isNotEmpty(list));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
