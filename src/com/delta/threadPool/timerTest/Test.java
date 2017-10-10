package com.delta.threadPool.timerTest;

import java.util.Timer;
import java.util.TimerTask;

public class Test {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                System.out.println("hello world");
            }
        };
        timer.schedule(task, 10, 2000);
    }
}
