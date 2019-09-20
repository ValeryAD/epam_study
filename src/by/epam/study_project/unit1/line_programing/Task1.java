package by.epam.study_project.unit1.line_programing;

import java.util.Scanner;

public class Task1 {

    //1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

    public static void main (String[] args){
        double z = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        Scanner sc = new Scanner(System.in);
        final String INPUT_REQUEST = "Please, type in double value";

        System.out.println(INPUT_REQUEST);
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(INPUT_REQUEST);
        }
        a = sc.nextDouble();

        System.out.println(INPUT_REQUEST);
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(INPUT_REQUEST);
        }
        b = sc.nextDouble();

        System.out.println(INPUT_REQUEST);
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(INPUT_REQUEST);
        }
        c = sc.nextDouble();

        z = ((a - 3) * b /2) + c;

        System.out.println("The result is: " + z);
    }
}
