package by.epam.study_project.unit1.cycle;

 /*7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
        m и n вводятся с клавиатуры.*/

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = -20;
        int n = 20;
        int divider = 0;
        final String mInputRequest = "Введите натуральное число, нижнее значение промежутка (m)";
        final String nInputRequest = "Введите натуральное число, верхнее значение промежутка (n)";
        final String wrongInput = "Неверный ввод";
        final String negInput = "Оба числа должны быть положительными";
        final String biggerM = "\'n\' должно быть больше \'m\'";
        final String report = "Делители числа %d:\n";
        boolean flag = false;


        // получение данных от пользователя
        do {
            flag = false;

            System.out.println(mInputRequest);
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println(wrongInput + "\n" + mInputRequest);
            }
            m = sc.nextInt();

            System.out.println(nInputRequest);
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println(wrongInput + "\n" + nInputRequest);
            }
            n = sc.nextInt();
            if (m > n || m < 0 || n < 0) {
                flag = true;
                System.out.println(wrongInput + "\n" +
                        negInput + ", " + biggerM);
            }

        } while (flag);


        for (int i = m; i <= n; i++) {
            System.out.printf(report, i);
            divider = i - 1;
            while (divider > 1) {
                if (i % divider == 0) {
                    System.out.println(divider);
                }
                divider--;

            }
        }

    }
}
