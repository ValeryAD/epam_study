package by.epam.study_project.unit1.line_programing;

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
        final String inputRequest = "Please type in double value";

        System.out.println(inputRequest);
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(inputRequest);
        }
        a = sc.nextDouble();

        System.out.println(inputRequest);
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(inputRequest);
        }

        b = sc.nextDouble();

        System.out.println(inputRequest);

        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(inputRequest);
        }
        c = sc.nextDouble();

        result = b + sqrt(pow(b, 2) + 4 * a * c);
        result /= 2*a;
        result -= pow(a,3)*c;
        result += pow(b,-2);

        System.out.println("The result is : " + result);
    }
}
