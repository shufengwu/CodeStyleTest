package com.delta.EqualsTest;

import java.util.Objects;

public class EqualsTest {
    private static String str1 = "111111111";
    private static Object o;
    private static EqualsTest equalsTest;
    private static Object o1;
    private static Object o2;


    private static Integer integer1 = -128;
    private static Integer integer2 = -128;

    private static Integer integer3 = 130;
    private static Integer integer4 = 130;

    public static void main(String[] args) {

        System.out.println(null == str1);
        System.out.println();
        System.out.println(str1.equals(o));
        System.out.println();
        System.out.println(Objects.equals(str1, o));
        System.out.println();
        System.out.println(Objects.equals(o1, o2));
        System.out.println();

        //一、（四）、7
        System.out.println("-128到127之间：");
        System.out.println(integer1.equals(integer2));
        System.out.println(integer1 == integer2);
        System.out.println();

        System.out.println("-128到127之外：");
        System.out.println(integer3.equals(integer4));
        System.out.println(integer3 == integer4);

        //一、（四）、8


    }
}
