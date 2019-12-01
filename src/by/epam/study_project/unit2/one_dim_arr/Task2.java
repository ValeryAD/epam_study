package by.epam.study_project.unit2.one_dim_arr;

/*2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.*/

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        int z = 6;
        int counter = 0;
        final String report = "Количество замен %d\nотредактированный массив:\n";

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 10) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > z){
                arr[i] = z;
                counter++;
            }
        }

        System.out.printf(report, counter);
        System.out.println(Arrays.toString(arr));
    }


}
