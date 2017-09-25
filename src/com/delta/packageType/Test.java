package com.delta.packageType;

public class Test {

    static int score;

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("wsf");
        //student.setScore(null);
        student.setScore(5);
        printScore(student);
    }

    public static void printScore(Student student) {
        if (null != student.getScore()) {
            score = student.getScore().intValue();
            System.out.println("姓名：" + student.getName() + "，分数：" + student.getScore());
        } else {
            //score = student.getScore().intValue();
            System.out.println("姓名：" + student.getName() + "，分数：" + student.getScore());
        }
    }
}
