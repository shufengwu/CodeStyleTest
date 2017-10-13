package com.delta.setTest.setTest;

import java.util.ArrayList;
import java.util.List;

public class SetTest {
    public static void main(String[] args) {
        //定义一个List
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        list.add("jkl");
        //System.out.println(list);

        //用set给list去重
        /*Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);*/

        //用toArray方法将list转为数组
        /*String[] listArray = new String[list.size()];
        listArray = list.toArray(listArray);
        for (String s : listArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        //toArray带参数方法，入参分配空间不够大
        listArray = new String[list.size() - 2];
        listArray = list.toArray(listArray);
        for (String s : listArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        //toArray带参数方法，入参分配空间大于实际所需
        listArray = new String[list.size() + 2];
        listArray = list.toArray(listArray);
        for (String s : listArray) {
            System.out.print(s + " ");
        }
        System.out.println();*/


        //asList
        /*String[] arr = new String[]{"ab", "cd", "ef", "gh"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2);

        list2.add("ij");
        System.out.println(list2);

        arr[0] = "ba";
        System.out.println(arr[0]);
        System.out.println(list2);*/


    }
}
