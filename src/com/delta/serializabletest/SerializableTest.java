package com.delta.serializabletest;
/**
 * 序列化
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTest {
    public static void main(String[] args) {
        User1 user1 = new User1();
        user1.setName("wsf");
        user1.setAge(26);
        //user1.setAddress("ysu");
        System.out.println(user1);

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("F:\\tempFile.obj"));
            oos.writeObject(user1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
