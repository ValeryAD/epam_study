package by.epam.study_project.line_programing;

/*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
        данное значение длительности в часах, минутах и секундах в следующей форме:
        ННч ММмин SSc.*/

import java.util.Date;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        final int MIN = 60;
        final int HOUR = 60 * MIN;
        final int DAY = 24 * HOUR;
        final String inputRequest = "Please type in time value in seconds";
        final String wrongInputMessage = "Wrong input";
        final String formatRequest
                = "Which hours format should be represented?" +
                "\n\t 1. Hours within day (0-23) " +
                "\n\t 2. Full amount of hours" +
                "\n\t 0. To exit" +
                "\nYour formatChoice: 1,2 or 0?";

        //getting data from user
        Scanner sc = new Scanner(System.in);
        System.out.println(inputRequest);

        while (!sc.hasNextLong()) {
            System.out.println(wrongInputMessage + "\n" + inputRequest);
            sc.next();
        }
        long seconds = Math.abs(sc.nextLong());

        int formatChoice = -1;
        do {
            System.out.println(formatRequest);
            while (!sc.hasNextInt()) {
                System.out.println(wrongInputMessage + "\n" + formatRequest);
                sc.next();
            }
            formatChoice = sc.nextInt();
        } while (!(formatChoice == 1 || formatChoice == 2 || formatChoice == 0));


        //calculations
        long hours = 0;
        long mins = 0;
        if (formatChoice == 1) {
            long timeWithoutDays = seconds % DAY;
            hours = timeWithoutDays / HOUR;
            mins = timeWithoutDays % HOUR / MIN;
            seconds = timeWithoutDays % HOUR % MIN;
        } else if (formatChoice == 2) {
            hours = seconds / HOUR;
            mins = seconds % HOUR / MIN;
            seconds = seconds % MIN;
        } else if (formatChoice == 0) {
            System.exit(0);
        }

        //Report
        System.out.printf("%02dч %02dмин %02dс", hours, mins, seconds);
    }
}
