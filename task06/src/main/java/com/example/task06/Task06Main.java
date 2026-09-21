package com.example.task06;

public class Task06Main {

    static int getMax(int a, int b, int c, int d) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        if (d > max) {
            max = d;
        }

        return max;
    }
}
