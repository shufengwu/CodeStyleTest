package com.delta;

import java.time.Instant;
import java.util.Date;
import java.util.regex.Pattern;

public class PatternTest {

    static String feeder = "KT8BD30695";
    static String feederRes = "^KT[0-9a-zA-Z]{2,3}D3[0-9]{4}$";
    static Pattern p2 = Pattern.compile(feederRes);

    public static void main(String[] args) {
        /*long startTime1 = System.currentTimeMillis();

        for(int i=0;i<1000000;i++){
            Pattern p1 = Pattern.compile(feederRes);
            Matcher m1 = p1.matcher(feeder);
            System.out.println(m1.matches());
        }
        System.out.println(System.currentTimeMillis()-startTime1);

        long startTime2 = System.currentTimeMillis();

        for(int i=0;i<1000000;i++){
            Matcher m2 = p2.matcher(feeder);
            //System.out.println(m.matches());
        }
        System.out.println(System.currentTimeMillis()-startTime2);

        long startTime3 = System.currentTimeMillis();*/

        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());
        System.out.println(Instant.now().toEpochMilli());
        System.out.println(System.nanoTime());

    }
}
