package by.epam.study_project.unit1.line_program;

import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Task2 {

    //2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        double c = 0;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        final String inputRequest = "Введите значение ";
        final String wrongInputMessage = "Неверный ввод";
        final String answer = "Результат ";

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

        result = b + sqrt(pow(b, 2) + 4 * a * c);
        result /= 2*a;
        result -= pow(a,3)*c;
        result += pow(b,-2);

        System.out.println(answer + result);
    }
}
