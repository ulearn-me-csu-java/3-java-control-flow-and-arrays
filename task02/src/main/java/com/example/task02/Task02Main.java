package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        String season = "";
        switch (monthNumber){
            case 3,4,5 -> season = "весна";
            case 6,7,8 -> season = "лето";
            case 9,10,11 -> season = "осень";
            case 12,1,2 -> season = "зима";
        }
        return season;//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}