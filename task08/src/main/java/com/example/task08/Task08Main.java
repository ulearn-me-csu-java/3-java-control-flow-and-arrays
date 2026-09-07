package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {
        int len = arr.length;
        int i = 0;
        long proiz = 1;
        if (len == 0) {
            return 0;
        } else {
            while (i < len) {
                proiz = proiz * arr[i];
                i++;
            }
        }
        return proiz;

    }


}