package by.epam.study_project.unit2.one_dim_arr;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {
    public static void main(String[] args) {
        int k = 9;
        int[] a = {8, 9, 27, 17, 81, 22, 24, 5};
        int result = 0;

        for (int m : a) {
            if (m % k == 0) {
                result += m;
            }
        }

        System.out.println(result);
    }
}
