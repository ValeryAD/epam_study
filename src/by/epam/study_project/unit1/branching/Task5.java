package by.epam.study_project.unit1.branching;

import static java.lang.Math.pow;

/*5. Вычислить значение функции:*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double x = 0;
        double result;
        Scanner sc = new Scanner(System.in);
        final String inputRequest = "Type in value (double) for calculation";
        final String wrongInputMessage = "Wrong input";

        System.out.println(inputRequest);
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println(wrongInputMessage + "\n" + inputRequest);
        }
        x = sc.nextDouble();

        if (x > 3) {
            result = 1 / (pow(x, 3) + 6);
        } else {
            result = pow(x,2) - 3*x + 9;
        }

        System.out.println(result);
    }
}
