package by.epam.study_project.unit2.mult_dim_arr;

 /*16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
        собой. Построить такой квадрат.*/

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        final int n = 4;
        int sum = (n * (n * n + 1)) / 2;

        int[][] matrix = generateMatrix();
        int[] array = matrixToOneDimArray(matrix);

        printMatrix(array);

    }

    private static int[][] generateMatrix() {
        return new int[][]{{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
    }

    private static int[] matrixToOneDimArray(int[][] matrix) {
        int[] array = new int[matrix.length * matrix.length];
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                array[counter++] = matrix[i][j];
            }
        }
        return array;
    }

    private static void printMatrix(int[] array){
        int n = (int) Math.sqrt(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]);
            if((i + 1) % n == 0){
                System.out.println();
            }
        }
    }

}
