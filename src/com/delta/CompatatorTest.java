package com.delta;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompatatorTest {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(10), new Student(7), new Student(4), new Student(4),
                new Student(2), new Student(2), new Student(7), new Student(3),
                new Student(10), new Student(7), new Student(4), new Student(4),
                new Student(2), new Student(2), new Student(7), new Student(3),
                new Student(10), new Student(7), new Student(4), new Student(4),
                new Student(2), new Student(2), new Student(7), new Student(3),
                new Student(10), new Student(7), new Student(4), new Student(4),
                new Student(2), new Student(2), new Student(7), new Student(3),
                new Student(4), new Student(4), new Student(2), new Student(2),
                new Student(7), new Student(3));
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age > o2.age ? 1 : -1;
                /*if (o1.age > o2.age) {
                    return 1;
                } else if (o1.age < o2.age) {
                    return -1;
                } else {
                    return 0;
                }*/
            }
        });

        for (Student integer : list) {
            System.out.println(integer.age);
        }
    }


}

class Student {
    int age;

    public Student(int age) {
        this.age = age;
    }
}
