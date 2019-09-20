package by.epam.study_project.unit1.line_programing;

/*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
        данное значение длительности в часах, минутах и секундах в следующей форме:
        ННч ММмин SSc.*/

import java.util.Date;
import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {
        final int SECOND = 1000;
        final int MIN = 60 * SECOND;
        final int HOUR = 60 * MIN;
        final int DAY = 24 * HOUR;
        final String inputRequest = "Please type in time value in milliseconds (long value)";
        final String FORMAT_REQUEST
                = "Which hours format should be represented?" +
                "\n\t 1. Hours within day (0-23) " +
                "\n\t 2. Full amount of hours" +
                "Your choice 1 or 2?";

        Scanner sc = new Scanner(System.in);

        System.out.println(inputRequest);

        while (!sc.hasNextLong()) {
            System.out.println(inputRequest);
            sc.next();
        }

        long millis = sc.nextLong();

        int choice = 0;

        while (true) {
            while (!sc.hasNextInt()) {
                System.out.println(FORMAT_REQUEST);
                sc.next();
            }

            choice = sc.nextInt();
            if (choice == 1 && choice == 2) {       //TODO make a decision if it needs using  '0' to exit
                break;
            }else if(choice == 0) {
                System.exit(0);
            }else{
                continue;
            }

        }


        //long millis = 9876543210L;

        long timeWithoutDays = millis % DAY;
        long hours = timeWithoutDays / HOUR;
        long mins = timeWithoutDays % HOUR / MIN;
        long seconds = timeWithoutDays % MIN / SECOND;


/*
        long hours = millis / (HOUR);

        long mins = (millis - hours * HOUR) / (60 * 1000);
        long seconds = (millis - hours * HOUR - mins * MIN) / SECOND;
*/
        System.out.println(hours);
        System.out.println(mins);
        System.out.println(seconds);

        System.out.println("----------------------");

        Date da = new Date(millis);

        System.out.println(da.getHours());
        System.out.println(da.getMinutes());
        System.out.println(da.getSeconds());

    }
}
