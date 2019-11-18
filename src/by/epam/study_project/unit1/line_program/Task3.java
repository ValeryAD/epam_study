package by.epam.study_project.unit1.line_program;

import java.util.Scanner;
import static java.lang.Math.toRadians;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

public class Task3 {

    //3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

    public static void main(String[] args) {

        double x = 0;
        double y = 0;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        final String inputRequest = "Please, type in double value";
        final String wrongInputMessage = "Wrong input";

        System.out.println(inputRequest);
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(wrongInputMessage + "\n" + inputRequest);
        }
        x = sc.nextDouble();

        System.out.println(inputRequest);
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(wrongInputMessage + "\n" + inputRequest);
        }
        y = sc.nextDouble();

        result = sin(toRadians(x) + cos(toRadians(y)));
        result /= cos(toRadians(x) - sin(toRadians(y)));
        result *= tan(toRadians(x*y));

        System.out.println("The result is : " + result); }
}
