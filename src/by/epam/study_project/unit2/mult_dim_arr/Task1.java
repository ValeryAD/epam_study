package by.epam.study_project.unit2.mult_dim_arr;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1 {
    public static void main(String[] args) {
        final int n = 5;
        //int[][] matrix = new int[n][n];

       /* for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random() * 10 + 1);
            }
        }*/

        int[][] matrix = {{1, 5, 1, 2, 2, 8}, {2, 2, 2, 2, 2, 2}, {3, 3, 3, 3, 3, 3,}};
        //TODO нечетные?
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                boolean odd = i % 2 != 0;
                boolean biggerFirstEl = matrix[i][0] > matrix[i][matrix[i].length - 1];
                if (odd) {
                    System.out.printf("%3d", matrix[i][j]);
                }
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
