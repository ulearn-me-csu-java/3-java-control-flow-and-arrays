package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0){
            return;
        }

        int cycle = 0;

        while (cycle != arr.length) {
            int min = arr[cycle];
            int minNum = 0;
            for (int i = cycle; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minNum = i;
                    int temp = arr[cycle];
                    arr[cycle] = min;
                    arr[minNum] = temp;
                }
            }
            cycle += 1;
        }

    }

}