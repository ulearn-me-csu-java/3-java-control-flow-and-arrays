package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null) return arr;

        int countMoreThen1000 = 0;
        for (int i : arr) {
            if (i <= 1000) countMoreThen1000++;
        }

        int [] newArr = new int [countMoreThen1000];
        int j = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= 1000) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }

}