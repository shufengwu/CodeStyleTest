package com.delta.build;

public class Student {
    private String name;
    private int age;
    private String address;
    private String teacher;
    private String school;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.teacher = builder.teacher;
        this.school = builder.school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", teacher='" + teacher + '\'' +
                ", school='" + school + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;
        private String teacher;
        private String school;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setTeacher(String teacher) {
            this.teacher = teacher;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

        public void showInfo() {
            Student student = build();
            System.out.println(student.toString());
        }
    }
}
