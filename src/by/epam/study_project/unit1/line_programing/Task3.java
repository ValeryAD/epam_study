package by.epam.study_project.unit1.line_programing;

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
        final String INPUT_REQUEST = "Please, type in double value";

        System.out.println(INPUT_REQUEST);
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(INPUT_REQUEST);
        }
        x = sc.nextDouble();

        System.out.println(INPUT_REQUEST);
        while(!sc.hasNextDouble()){
            sc.next();
            System.out.println(INPUT_REQUEST);
        }
        y = sc.nextDouble();

        result = sin(toRadians(x) + cos(toRadians(y)));
        result /= cos(toRadians(x) - sin(toRadians(y)));
        result *= tan(toRadians(x*y));

        System.out.println("The result is : " + result); }
}
