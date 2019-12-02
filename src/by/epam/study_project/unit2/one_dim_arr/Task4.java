package by.epam.study_project.unit2.one_dim_arr;

//4. Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        final int n = 10;
        double[] arr = new double[n];
        int min_i = 0;
        int max_i = 0;
        final String report = "Было:\n" +
                "%s\n" +
                "стало:\n" +
                "%s";
        final String arrPrimeryState;

        //генерация значений массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 1000;
        }

        arrPrimeryState = Arrays.toString(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[min_i] > arr[i]){
                min_i = i;
            }

            if(arr[max_i] < arr[i]){
                max_i = i;
            }
        }

        double temp = arr[min_i];
        arr[min_i] = arr[max_i];
        arr[max_i] = temp;

        System.out.printf(report, arrPrimeryState, Arrays.toString(arr));
    }
}
