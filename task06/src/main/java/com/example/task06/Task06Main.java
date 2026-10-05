package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        int e=a;
        if (b>a) {
           e=b;
        }
        if (c>b) {
            e=c;
        }
        if (d>c) {
            e=d;
        }
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return e;
    }

}