package com.delta.threadPool;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

public class DateFormatTest {
    /**
     * 采用SimpleDateFormat
     */
    /*private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
    private static String date[] = {"01-01-1999", "01-01-2000", "01-01-2001"};
    public static void main(String[] args) {
        for (int i = 0; i < date.length; i++) {
            final int temp = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for(int jj=0;jj<100;jj++){
                            String str1 = date[temp];
                            String str2 = sdf.format(sdf.parse(str1));
                            System.out.println(Thread.currentThread().getName() + ", " + str1 + "," + str2);
                            if(!str1.equals(str2)){
                                throw new RuntimeException(Thread.currentThread().getName()
                                        + ", Expected " + str1 + " but got " + str2);
                            }
                        }
                    } catch (Exception e) {
                        throw new RuntimeException("parse failed", e);
                    }
                }
            }).start();
        }
    }*/

    /**
     * 采用DateUtils
     */

    private static String pattern = "dd-MM-yyyy";
    private static String date[] = {"01-01-1999", "01-01-2000", "01-01-2001"};

    public static void main(String[] args) {
        for (int i = 0; i < date.length; i++) {
            final int temp = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int jj = 0; jj < 100; jj++) {
                            String str1 = date[temp];
                            String str2 = DateFormatUtils.format(DateUtils.parseDate(str1, pattern), pattern);
                            System.out.println(Thread.currentThread().getName() + ", " + str1 + "," + str2);
                            if (!str1.equals(str2)) {
                                throw new RuntimeException(Thread.currentThread().getName()
                                        + ", Expected " + str1 + " but got " + str2);
                            }
                        }
                    } catch (Exception e) {
                        throw new RuntimeException("parse failed", e);
                    }
                }
            }).start();
        }
    }



}
