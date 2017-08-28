package com.delta.serializabletest;

import java.io.Serializable;

public class User1 implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    //private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                //", address='" + address + '\'' +
                '}';
    }
}
