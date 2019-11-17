package by.epam.study_project.line_programing;

import java.util.Scanner;

public class Task4 {

   /* *4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    дробную и целую части числа и вывести полученное значение числа.*/

    public static void main(String[] args) {

        final int CAPACITY = 1000;

        double r = 0;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        final String inputRequest = "Please, type in double value \nbetween 999,999 and -999,999";
        final String wrongInputMessage = "Wrong input";
        boolean isNotCorrectValue = false;

        do {
            if (isNotCorrectValue) {
                System.out.println(wrongInputMessage);
            }
            System.out.println(inputRequest);
            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.println(wrongInputMessage + "\n" + inputRequest);
            }

            r = sc.nextDouble();
            isNotCorrectValue = (r >= CAPACITY || r <= -CAPACITY);
        } while (isNotCorrectValue);


        int intValue = (int) r;
        //int reminder = (int) (r % intValue * CAPACITY); //это выражение лаконичней, но иногда из-за double целая часть
        //результата получается на 1 меньше
        int reminder = (int) (r * 1000 - intValue * 1000); // так всегда правильно

        result = reminder + ((double) intValue / CAPACITY);
        System.out.print(result);
    }
}
