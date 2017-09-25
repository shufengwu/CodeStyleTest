package com.delta.copytest;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setNumber(12345);
        System.out.println("学生1：" + student1.getNumber() + "");
        Student student2 = student1;
        System.out.println("学生2：" + student2.getNumber() + "");
        student2.setNumber(54321);
        System.out.println("学生1：" + student1.getNumber() + "");
        System.out.println("学生2：" + student2.getNumber() + "");


    }
}
