package by.epam.study_project.unit2.one_dim_arr;

//4. Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 15, 7, 1 , 10, 13};
        int min_i = 0;
        int max_i = 0;
        final String report = "Было:\n" +
                "%s\n" +
                "стало:\n" +
                "%s";
        final String arrPrimeState = Arrays.toString(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[min_i] > arr[i]){
                min_i = i;
            }

            if(arr[max_i] < arr[i]){
                max_i = i;
            }
        }

        int temp = arr[min_i];
        arr[min_i] = arr[max_i];
        arr[max_i] = temp;

        System.out.printf(report, arrPrimeState, Arrays.toString(arr));
    }
}
