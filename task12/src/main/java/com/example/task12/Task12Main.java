package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        // здесь вы можете вручную протестировать ваше решение, вызывая реализуемый
        // метод и смотря результат
        // например вот так:
        /*
         * int[] arr = {9, 11, 7, 8};
         * selectionSort(arr);
         * System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 1) { return; }
       
        for (int curInd = 0; curInd < arr.length; curInd++) {
            int min = curInd;
            for (int i = curInd+1; i < arr.length; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            int temp = arr[min];
            arr[min] = arr[curInd];
            arr[curInd] = temp;
        }
    }

}