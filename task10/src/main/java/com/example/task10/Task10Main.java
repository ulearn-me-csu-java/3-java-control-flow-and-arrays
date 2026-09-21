package com.example.task10;

public class Task10Main {

    static int numMin(int[] arr) {
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }
}
