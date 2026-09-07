package com.example.task09;

import java.util.Arrays;

public class Task09Main {
    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        System.out.println(min(arr));

    }

    static int min(int[] arr) {

        int firstmin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < firstmin) {
                firstmin = arr[i];
            }
        }

        return firstmin;
    }

}