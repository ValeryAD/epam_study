package by.epam.study_project.unit1.line_programing;

import java.util.Scanner;

public class Task4 {

    private static final int CAPACITY = 1000;
    private static final double MAX_VALUE = 999.999;

    public static void main(String[] args) {

        double r = 0;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        final String inputRequest = "Please, type in double value \nbetween 999,999 and -999,999";
        boolean isNotCorrectValue = false;

        do {
            System.out.println(inputRequest);
            while(!sc.hasNextDouble()){
                sc.next();
                System.out.println(inputRequest);
            }

            r = sc.nextDouble();
            isNotCorrectValue = ! (MAX_VALUE > r && r > -MAX_VALUE);
        } while (isNotCorrectValue);


        int myInteger = (int)r;
        int reminder = (int) (r* CAPACITY - myInteger*CAPACITY);
        //double reminder = r*CAPACITY - myInteger*CAPACITY;
        result = reminder + ((double)myInteger/CAPACITY);
        System.out.print(result);
    }
}
