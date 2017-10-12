package com.delta.threadPool;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

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
                            Date d = sdf.parse(str1);
                            String str2 = sdf.format(d);
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

    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US);
    private static String date[] = {"01-01-1999", "01-01-2000", "01-01-2001"};
    /**
     * 采用DateUtils
     */

    /*private static String pattern = "dd-MM-yyyy";
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
                            Date d = DateUtils.parseDate(str1, pattern);
                            String str2 = DateFormatUtils.format(d, pattern);
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
    }*/

    private static String pattern = "dd-MM-yyyy";

    public static void main(String[] args) {
        for (int i = 0; i < date.length; i++) {
            final int temp = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int jj = 0; jj < 100; jj++) {
                            String str1 = date[temp];
                            LocalDate ldt = LocalDate.parse(str1, dtf);

                            String str2 = dtf.format(ldt);
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
