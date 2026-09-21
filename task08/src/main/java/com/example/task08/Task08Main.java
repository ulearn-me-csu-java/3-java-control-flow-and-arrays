package com.example.task08;

public class Task08Main {

    static long mult(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        long product = 1;

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        return product;
    }
}
