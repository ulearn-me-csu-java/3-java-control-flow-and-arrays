package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int min = arr[0];
        int count = -1;
        int count_min  = 0;
        for (int num : arr) { //прогоняем все числа в массиве
            count++;
            if (num <= min) {
                min = num;
                count_min = count;
            }
        }
        int temp = arr[0];
        arr[0] = arr[count_min];
        arr[count_min] = temp;
    }
}