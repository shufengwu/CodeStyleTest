package com.delta.list_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListSort {
    public static void main(String[] args) {
        Student s1 = new Student(6, "c");
        Student s2 = new Student(2, "f");
        Student s3 = new Student(4, "e");
        Student s4 = new Student(3, "d");
        Student s5 = new Student(1, "a");
        Student s6 = new Student(5, "b");
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        /**
         * 获取最大值
         */
        String maxName = Collections.max(list, (o1, o2) -> {
            if (o1.getId() > o2.getId()) {
                return 1;
            } else if (o1.getId() < o2.getId()) {
                return -1;
            } else {
                return 0;
            }
        }).getName();
        System.out.println(maxName);

        String minName = Collections.min(list, (o1, o2) -> {
            if (o1.getId() > o2.getId()) {
                return 1;
            } else if (o1.getId() < o2.getId()) {
                return -1;
            } else {
                return 0;
            }
        }).getName();
        System.out.println(minName);

        /**
         * 排序
         */
        list.sort((o1, o2) -> {
            if (o1.getId() < o2.getId()) {
                return 1;
            } else if (o1.getId() > o2.getId()) {
                return -1;
            } else {
                return 0;
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}
