package by.epam.study_project.unit2.one_dim_arr;

//7. Даны действительные числа (a1, a2, a3, ... , a2n). Найти max(a1+a2n, a2+a2n-1, ... , an+an+1)

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

        int n = 10;
        double[] arr = new double[2 * n];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextDouble() * r.nextInt(100);
        }

        double max = 0;
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            double temp = arr[i] + arr[j];
            if (temp > max) {
                max = temp;
            }
        }

        System.out.println(max);
    }
}
