package by.epam.study_project.unit1.cycle;

        /*5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
        заданному е. Общий член ряда имеет вид:*/

import java.util.Scanner;
import static java.lang.Math.pow;

public class Task5 {
    public static void main(String[] args) {
        int n = 0;
        double e = 0;
        double an = 0;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        final String eInputRequest = "Введите число \'e\'";
        final String nInputRequest = "Введите число \'n\'";
        final String wrongInput = "Неверный ввод";

        System.out.println(eInputRequest);
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println(wrongInput + "\n" + eInputRequest);
        }
        e = sc.nextDouble();

        System.out.println(nInputRequest);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(wrongInput + "\n" + nInputRequest);
        }
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            an = Math.abs(1 / pow(2, i) + 1 / pow(3, i));
            if(an > e){
                sum += an;
            }
        }
        System.out.println(sum);
    }
}
