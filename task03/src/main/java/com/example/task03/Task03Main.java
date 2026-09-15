package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String day = "";
        switch (weekDaysNumber){
            case 1 -> day = "понедельник";
            case 2 -> day = "вторник";
            case 3 -> day = "среда";
            case 4 -> day = "четверг";
            case 5 -> day = "пятница";
            case 6 -> day = "суббота";
            case 7 -> day = "воскресенье";
            default -> day = "такого дня недели не существует";
        }
        return day;//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}