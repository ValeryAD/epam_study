package by.epam.study_project.unit1.line_programing;

/*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
        данное значение длительности в часах, минутах и секундах в следующей форме:
        ННч ММмин SSc.*/

import java.util.Date;
import java.util.Scanner;

public class Task5 {
    //TODO убрать миллисекунды!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public static void main(String[] args) {
        final int SECOND = 1000;
        final int MIN = 60 * SECOND;
        final int HOUR = 60 * MIN;
        final int DAY = 24 * HOUR;
        final String INPUT_REQUES = "Please type in time value in milliseconds (long value)";
        final String FORMAT_REQUEST
                = "Which hours format should be represented?" +
                "\n\t 1. Hours within day (0-23) " +
                "\n\t 2. Full amount of hours" +
                "\n\t 0. To exit" +
                "\nYour formatChoice: 1,2 or 0?";

        Scanner sc = new Scanner(System.in);

        System.out.println(INPUT_REQUES);

        while (!sc.hasNextLong()) {
            System.out.println(INPUT_REQUES);
            sc.next();
        }
        long millis = sc.nextLong();

        int formatChoice = -1;
        do {
            System.out.println(FORMAT_REQUEST);
            while (!sc.hasNextInt()) {
                System.out.println(FORMAT_REQUEST);
                sc.next();
            }

            formatChoice = sc.nextInt();

        } while (!(formatChoice == 1 || formatChoice == 2 || formatChoice == 0));

        long hours = 0;
        long mins = 0;
        long seconds = 0;

        if (formatChoice == 1) {
            long timeWithoutDays = millis % DAY;
            hours = timeWithoutDays / HOUR;
            mins = timeWithoutDays % HOUR / MIN;
            seconds = timeWithoutDays % MIN / SECOND;
        } else if (formatChoice == 2) {
            hours = millis / HOUR;
            mins = (millis - (hours * HOUR)) / MIN;
            seconds = (millis - (hours * HOUR) - (mins * MIN)) / SECOND;
        } else if (formatChoice == 0) {
            System.exit(0);
        }

        //Report

        System.out.printf("%02dч %02dмин %02dс", hours, mins, seconds);
    }
}
