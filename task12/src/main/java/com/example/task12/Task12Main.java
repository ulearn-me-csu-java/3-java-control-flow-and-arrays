package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr != null) {
            int ind = 0;
            while (ind < arr.length) {
                int min = arr[ind];
                int id = ind;
                for (int i = ind; i < arr.length; i++) {
                    if (arr[i] < min) {
                        min = arr[i];
                        id = i;
                    }
                }

                int temp = arr[ind];
                arr[ind] = arr[id];
                arr[id] = temp;

                ind++;
            }
        }
    }
}