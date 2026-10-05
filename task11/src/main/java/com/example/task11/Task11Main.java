package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr==null || arr.length==0) {
            return;
        }
        int b=0;
        int a=arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i]<=a) {
                a=arr[i];
                b=i;
            }
        }
        int c=arr[0];
        arr[0]=arr[b];
        arr[b]=c;
    }//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
}