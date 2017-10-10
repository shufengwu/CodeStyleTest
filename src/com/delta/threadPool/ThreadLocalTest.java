package com.delta.threadPool;

public class ThreadLocalTest {
    static ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
    static ThreadLocal<String> stringLocal = new ThreadLocal<String>();

    public static void main(String[] args) throws InterruptedException {
        final ThreadLocalTest threadLocalTest = new ThreadLocalTest();


        threadLocalTest.set();
        System.out.println(threadLocalTest.getLong());
        System.out.println(threadLocalTest.getString());


        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                threadLocalTest.set();
                System.out.println("thread1: " + threadLocalTest.getLong());
                System.out.println("thread1: " + threadLocalTest.getString());
            }
        });
        thread1.start();
        thread1.join();

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                threadLocalTest.set();
                System.out.println("thread2: " + threadLocalTest.getLong());
                System.out.println("thread2: " + threadLocalTest.getString());
            }
        });
        thread2.start();
        thread2.join();

        System.out.println("主线程: " + threadLocalTest.getLong());
        System.out.println("主线程: " + threadLocalTest.getString());
    }

    public void set() {
        longLocal.set(Thread.currentThread().getId());
        stringLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longLocal.get();
    }

    public String getString() {
        return stringLocal.get();
    }
}
