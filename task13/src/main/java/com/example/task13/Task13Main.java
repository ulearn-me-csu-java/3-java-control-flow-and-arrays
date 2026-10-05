package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr==null) {
            return null;
        }
        int a=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]<=1000) {
                a++;
            }
        }
        int[] result=new int[a];
        int j=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]<=1000) {
                result[j]=arr[i];
                j++;
            }
        }
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return result;
    }

}