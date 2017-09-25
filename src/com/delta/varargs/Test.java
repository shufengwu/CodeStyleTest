package com.delta.varargs;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Teacher t3 = new Teacher();
        test(s1, s2, s3, t1, t2, t3);
    }

    public static void test(Person... p) {
        for (Person person : p) {
            Student student = (Student) person;
            student.goToSchool();
        }
    }
}
