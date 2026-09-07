package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
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
        return count_min;
    }

}