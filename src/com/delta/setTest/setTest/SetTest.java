package com.delta.setTest.setTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        //定义一个List
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("d");
        list.add("g");
        list.add("j");
        list.add("j");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        System.out.println(list);

        /*List<String> subList = list.subList(2,4);
        list.set(2,"z");
        System.out.println(subList.size());
        System.out.println(list.size());*/


        //用set给list去重
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            set.add(i + "");
        }
        System.out.println(set);
        System.out.println(set);
        System.out.println(set);
        System.out.println(set);
        System.out.println(set);
        System.out.println(set);
        System.out.println(set);

        /*list.clear();
        list.addAll(set);
        System.out.println(list);*/

        /*Set set2 = new  HashSet();
        List newList = new  ArrayList();
        for (String cd:list) {
            if(set2.add(cd)){
                newList.add(cd);
            }
        }
        System.out.println( "去重后的集合： " + newList);*/

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
        System.out.println();

        //类型转换
        listArray = new String[list.toArray().length];
        for(int i=0;i<listArray.length;i++){
            listArray[i] = (String)list.toArray()[i];
        }
        for (String s : listArray) {
            System.out.print(s + " ");
        }


        //asList
        String[] arr = new String[]{"ab", "cd", "ef", "gh"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2);

        list2.add("ij");
        System.out.println(list2);

        arr[0] = "ba";
        System.out.println(arr[0]);
        System.out.println(list2);*/


    }
}
