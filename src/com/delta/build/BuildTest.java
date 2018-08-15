package com.delta.build;

public class BuildTest {
    public static void main(String[] args) {
        new Student.Builder("wsf").setAge(28).setAddress("廊坊").setSchool("ysu").setTeacher("lcb").showInfo();
    }
}
