package by.epam.study_project.unit2.one_dim_arr;

/*9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
        чисел несколько, то определить наименьшее из них.*/

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int n = 30;
        //int[] arr = new int[n];

        //генерация массива
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }*/

        int[] arr = {2, 3, 5, 3, 5, 3, 2, 2, 3, 3, 3, 2, 2, 2, 3};


        int[] repetitionAmount = new int[arr.length]; // В этом массиве будем хранить количество повторений

        //подсчет количества повторений
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }

                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            repetitionAmount[i] = count;
        }

        int mostRepNumber = 0;//Наиболее часто встречающееся число
        int repAmount = 0; // количество повторений наиб. часто встреч. числа

        //определение наиболее часто встречающегося числа
        for (int i = 0; i < repetitionAmount.length; i++) {
            if (repAmount < repetitionAmount[i]) {
                repAmount = repetitionAmount[i];
                mostRepNumber = arr[i];
            } else if (repAmount == repetitionAmount[i]) { //если кол-во повторений одинаковое, выбираем меньшее число
                if (arr[i] < mostRepNumber) {
                    mostRepNumber = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(repetitionAmount));
        System.out.println(mostRepNumber);
    }

}
