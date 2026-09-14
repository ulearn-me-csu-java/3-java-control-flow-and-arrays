package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         */
    }

    static long mult(int[] arr) {
        long multp = 1;
        if (arr != null && arr.length > 0) {
            for (int number : arr) {
                multp *= number;
            }
            return multp;
        }
        return 0;
    }
}