package com.delta.exception;

import java.io.IOException;

public class CheckTest {
    public static void main(String[] args) throws IOException {

        /**
         * checked异常举例
         */
        /*FileInputStream fis = null;
        fis = new FileInputStream("B:/myfile.txt");
        int k;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
        fis.close();*/

        /**
         * unchecked异常举例
         */
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr[7]);

        /**
         *
         */
        try {
            throw new MyCheckedException();
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }

        throw new MyUncheckedException();
    }


}

/**
 * 自定义unchecked异常
 */
class MyUncheckedException extends RuntimeException {

}

/**
 * 自定义checked异常
 */
class MyCheckedException extends Exception {

}
