package by.epam.study_project.unit1.cycle;

//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task8 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int tempY = 0;
        int reminderX = 0;
        int reminderY = 0;
        final int base = 10;
        StringBuilder answer = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        final String inputRequest1 = "Введите первое число";
        final String inputRequest2 = "Введите второе число";
        final String wrongInput = "Неверный ввод";

        //getting user data

        System.out.println(inputRequest1);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(wrongInput + "\n" + inputRequest1);
        }
        x = abs(sc.nextInt());

        System.out.println(inputRequest2);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(wrongInput + "\n" + inputRequest2);
        }
        y = abs(sc.nextInt());

        //calculation
        do {
            reminderX = x % base;
            tempY = y;

            do {
                reminderY = tempY % base;
                if (reminderX == reminderY) {
                    answer.append(reminderY + ", ");
                }
                tempY /= base;
            } while (tempY >= 1);

            x /= base;
        } while (x >= 1);

        if (answer.length() > 2) {
            answer.delete(answer.length() - 2, answer.length());
        }

        System.out.println(answer);
    }

}
