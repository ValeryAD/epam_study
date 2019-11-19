package by.epam.study_project.unit1.cycle;

//    4. Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= 200; i++) {
            result = result.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(result);

    }
}
