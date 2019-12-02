package by.epam.study_project.unit2.one_dim_arr;

/*3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
        положительных и нулевых элементов.*/

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        final int n = 30;
        double[] arr = new double[n];
        double eps = 0.00_000_001;
        Random r = new Random();
        int zeroCount = 0;
        int posCount = 0;
        int negCount = 0;
        final String report = "Данный массив содержит:\n" +
                "%d - положительных элементов\n" +
                "%d - отрицательных элементов\n" +
                "%d - элементов близких к 0";

        // генерация значений массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 / Math.pow(2, i);
            arr[i] = arr[i] * (r.nextBoolean() ? 1 : -1);
        }

        //подсчет количества соответствующих элементов
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > eps) {
                posCount++;
            } else if (arr[i] < -eps) {
                negCount++;
            } else {
                zeroCount++;
            }
        }

        //вывод
        System.out.println(Arrays.toString(arr));
        System.out.printf(report, posCount, negCount, zeroCount);
    }
}
