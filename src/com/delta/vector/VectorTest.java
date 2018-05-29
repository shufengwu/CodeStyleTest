package com.delta.vector;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.addElement("one");
        vector.addElement(1);
        vector.addElement("two");
        vector.addElement(10L);
        vector.addElement("three");
        vector.addElement(3.0f);
        System.out.println(vector.size());
        System.out.println(vector);
    }
}
