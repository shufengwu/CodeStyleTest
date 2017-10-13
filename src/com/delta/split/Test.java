package com.delta.split;

public class Test {

    public static void main(String[] args) {
        String str1 = "a,b,c,,";
        String[] arr1 = str1.split(",");
        printArray(arr1);

        String str2 = "a,b,c,,d";
        String[] arr2 = str2.split(",");
        printArray(arr2);



    }

    static void printArray(String[] arr) {
        System.out.println("数组length：" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\"" + arr[i] + "\"");
        }
        System.out.println();
    }

}
