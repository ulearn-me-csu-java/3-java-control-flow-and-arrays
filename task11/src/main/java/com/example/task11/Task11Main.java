package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null || arr.length == 0) return;

        int min = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[min] > arr[i]) min = i;
        }

        int temp = arr[0];
        arr[0] = arr[min];
        arr[min] = temp;
    }

}