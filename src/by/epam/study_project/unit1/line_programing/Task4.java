package by.epam.study_project.unit1.line_programing;

import java.util.Scanner;

public class Task4 {

   /* *4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    дробную и целую части числа и вывести полученное значение числа.*/

    public static void main(String[] args) {

        final int CAPACITY = 1000;
        final double MAX_VALUE = 999.999;
        final double MIN_VALUE = -999.999;

        double r = 0;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        final String INPUT_REQUEST = "Please, type in double value \nbetween 999,999 and -999,999";
        boolean isNotCorrectValue = false;

        do {
            System.out.println(INPUT_REQUEST);
            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.println(INPUT_REQUEST);
            }

            r = sc.nextDouble();
            isNotCorrectValue = (r > MAX_VALUE || r < MIN_VALUE);
        } while (isNotCorrectValue);


        int myInteger = (int) r;
        int reminder = (int) (r * CAPACITY - myInteger * CAPACITY);
        result = reminder + ((double) myInteger / CAPACITY);
        System.out.print(result);
    }
}
