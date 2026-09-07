package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
    }

    static String getSeason(int monthNumber) {

        if(monthNumber < 3 || monthNumber == 12){return "зима";}
        if(monthNumber>8){return "осень";}
        if(monthNumber>5){return "лето";}
        if(monthNumber>2){return "весна";}

        return "";//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}