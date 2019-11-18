package by.epam.study_project.unit1.cycle;

/* Вычислить значения функции на отрезке [а,b] c шагом h:*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int h = 0;
        final String pointInputRequest = "Введите точку отрезка";
        final String stepInputRequest = "Введите шаг h";
        final String wrongInput = "Неверный ввод";


        System.out.println(pointInputRequest);
        while (!sc.hasNextInt()){
            sc.next();
            System.out.println(wrongInput + "\n" + pointInputRequest);
        }
        a = sc.nextInt();

        System.out.println(pointInputRequest);
        while (!sc.hasNextInt()){
            sc.next();
            System.out.println(wrongInput + "\n" + pointInputRequest);
        }
        b = sc.nextInt();

        System.out.println(stepInputRequest);
        while (!sc.hasNextInt()){
            sc.next();
            System.out.println(wrongInput + "\n" + stepInputRequest);
        }
        h = sc.nextInt();

        for (int i = a; i <= b ; i+=h) {
            if(i > 2){
                System.out.println(i);
            }else{
                System.out.println(-i);
            }
        }
    }
}
