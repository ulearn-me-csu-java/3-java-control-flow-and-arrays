package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {4, 2, 3, -5};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if (arr==null||arr.length==0) {
            return;
        }
        for (int i=0;i<arr.length;i++) {
                int b=i;
            for (int k=i+1;k<arr.length;k++) {
                if (arr[k]<=arr[b]) {
                    b=k;
                }
            }
            int c=arr[i];
            arr[i]=arr[b];
            arr[b]=c;
            //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        }

    }
}