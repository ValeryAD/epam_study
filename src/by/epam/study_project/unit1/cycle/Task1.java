package by.epam.study_project.unit1.cycle;

    /*1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
        все числа от 1 до введенного пользователем числа.*/


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int x = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        final String inputRequest = "Введите целое число";
        final String wrongInputMessage = "Неверный ввод";

        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(wrongInputMessage + "\n" + inputRequest);
        }
        x = Math.abs(sc.nextInt());

        for(int i = 1; i <= x; i++){  //от одного до введенного пользователем включительно
            result += i;
        }
        System.out.println(result);
    }
}
