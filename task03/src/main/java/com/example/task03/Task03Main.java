package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String [] dayWeek = {"понедельник","вторник","среда","четверг","пятница","суббота","воскресенье",};
        try{ return dayWeek[weekDaysNumber-1];}
        catch (ArrayIndexOutOfBoundsException e) {
            return "такого дня недели не существует";
        }
    }
}