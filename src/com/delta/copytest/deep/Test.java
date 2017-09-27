package com.delta.copytest.deep;

public class Test {
    public static void main(String[] args) {
        Address address = new Address();
        address.setAddr("北京");
        Student student1 = new Student();
        student1.setNumber(12345);
        student1.setAddress(address);
        System.out.println("学生1：" + student1.getNumber() + "---" + student1.getAddress().getAddr());
        try {
            Student student2 = (Student) student1.clone();
            System.out.println("学生2：" + student2.getNumber() + "---" + student2.getAddress().getAddr());
            address.setAddr("廊坊");
            System.out.println("学生1：" + student1.getNumber() + "---" + student1.getAddress().getAddr());
            System.out.println("学生2：" + student2.getNumber() + "---" + student2.getAddress().getAddr());
            System.out.println(student1 == student2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
