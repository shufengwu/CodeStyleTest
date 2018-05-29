package com.delta.double_format;

import java.text.DecimalFormat;

public class DoubleFormat {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("######0.00");
        double d1 = 3.23456;
        double d2 = 0.0;
        double d3 = 2.0;
        double d4 = 2.48607;
        System.out.println(df.format(d1));
        System.out.println(df.format(d2));
        System.out.println(df.format(d3));
        System.out.println(df.format(d4));
    }
}
