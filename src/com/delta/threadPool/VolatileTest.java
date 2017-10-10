package com.delta.threadPool;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.LongAdder;

public class VolatileTest {
    //public static volatile int count = 0;
    private final static CountDownLatch mCountDownLatch = new CountDownLatch(2);
    //static AtomicInteger count = new AtomicInteger();
    static LongAdder count = new LongAdder();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                //count++;
                //count.addAndGet(1);
                count.add(1);
            }
            mCountDownLatch.countDown();
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                //count++;
                //count.addAndGet(1);
                count.add(1);
            }
            mCountDownLatch.countDown();
        });

        Thread thread3 = new Thread(() -> {
            try {
                mCountDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(count);
        });
        thread3.start();
        thread1.start();
        thread2.start();
    }
}
