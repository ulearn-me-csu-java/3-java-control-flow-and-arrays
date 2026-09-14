package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

//        int[] arr = {9, 1100, 7, 8};
//        removeMoreThen1000(arr);
//        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null){
            return null;
        }

        if (arr.length == 0) {
            return new int[0];
        }

        int count = 0;
        for (int i : arr){
            if (i < 1001){
                count++;
            }
        }
        int[] result = new int[count];
        int cc = 0;
        for (int i : arr){
            if (i < 1001){
                result[cc] = i;
                cc++;
            }
        }
        return  result;
    }

}