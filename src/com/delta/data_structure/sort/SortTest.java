package com.delta.data_structure.sort;

public class SortTest {
    static int[] oldArr = new int[]{2, 8, 4, 6, 0, 3, 9, 1, 5, 7};

    public static void main(String[] args) {
        quickSort(oldArr);
        for (int i = 0; i < oldArr.length; i++) {
            System.out.println(oldArr[i]);
        }
    }


    /**
     * 普通冒泡排序
     *
     * @param arr
     * @return
     */
    static void bubbleSort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 优化后冒泡排序
     *
     * @param arr
     * @return
     */
    static void bubbleSort2(int[] arr) {
        boolean status = true;
        for (int i = 1; i < arr.length && status; i++) {
            status = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    status = true;
                }
            }
        }
    }

    /**
     * 简单选择排序
     *
     * @param arr
     * @return
     */
    static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                swap(arr, i, min);
            }

        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * 直接插入排序
     *
     * @param arr
     * @return
     */
    static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                for (int j = i - 1; j >= 0; j--) {
                    if (temp < arr[j]) {
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    /**
     * 快速排序
     *
     * @param arr
     * @return
     */
    static void quickSort(int[] arr) {
        qSort(arr, 0, arr.length - 1);
    }

    static void qSort(int[] arr, int low, int high) {
        int middle;
        if (low < high) {
            middle = setMiddle(arr, low, high);
            qSort(arr, low, middle - 1);
            qSort(arr, middle + 1, high);
        }
    }

    private static int setMiddle(int[] arr, int low, int high) {
        int m = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= m) {
                high--;
            }
            swap(arr, low, high);
            while (low < high && arr[low] <= m) {
                low++;
            }
            swap(arr, low, high);
        }
        return low;

    }
}
