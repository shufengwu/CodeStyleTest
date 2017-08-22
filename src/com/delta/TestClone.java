package com.delta;

public class TestClone {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("hehe");
        System.out.println(p1.getName());

        try {
            Person p2 = (Person) p1.clone();
            System.out.println(p2.getName());
            p1.setName("haha");
            System.out.println(p1.getName());
            System.out.println(p2.getName());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
