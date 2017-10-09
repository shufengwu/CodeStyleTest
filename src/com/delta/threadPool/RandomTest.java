package com.delta.threadPool;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {

    public static void main(String[] args) {
        Random r1 = new Random(5);
        for (int i = 0; i < 15; i++) {
            System.out.println(r1.nextInt());
        }

        System.out.println();
        Random r2 = new Random(5);
        for (int i = 0; i < 10; i++) {
            System.out.println(r2.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(ThreadLocalRandom.current().nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(ThreadLocalRandom.current().nextInt());
        }
    }

}

