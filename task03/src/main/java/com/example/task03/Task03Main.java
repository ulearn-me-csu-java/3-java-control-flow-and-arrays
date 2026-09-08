package com.example.task03;

import java.util.Map;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        Map<Integer, String> week = Map.of(
            1, "понедельник",
                2, "вторник",
                3, "среда",
                4, "четверг",
                5, "пятница",
                6, "суббота",
                7, "воскресенье"
        );

        if(weekDaysNumber<1 || weekDaysNumber>7){
            return "такого дня недели не существует";
        }
        return week.get(weekDaysNumber);
    }
}