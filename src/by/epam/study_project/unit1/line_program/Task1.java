package by.epam.study_project.unit1.line_program;

import java.util.Scanner;

public class Task1 {

    //1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

    public static void main (String[] args){
        double z = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        Scanner sc = new Scanner(System.in);
        final String inputRequest = "Введите значение ";
        final String wrongInputMessage = "Неверный ввод";
        final String answer = "Результат: ";

        System.out.println(inputRequest + "a");
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(wrongInputMessage + "\n" + inputRequest + "a");
        }
        a = sc.nextDouble();

        System.out.println(inputRequest + "b");
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(wrongInputMessage + "\n" + inputRequest + "b");
        }
        b = sc.nextDouble();

        System.out.println(inputRequest + "c");
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(wrongInputMessage + "\n" + inputRequest + "c");
        }
        c = sc.nextDouble();

        z = ((a - 3) * b /2) + c;

        System.out.println(answer + z);
    }
}
