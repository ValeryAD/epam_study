package by.epam.study_project.unit2.mult_dim_arr;

//10. Найти положительные элементы главной диагонали квадратной матрицы.

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        final int n = 5;
        int[][] matrix = new int[n][n];
        String pozElements = new String();
        final String report = "Матрица:\n" +
                "%s\n\n" +
                "положительные элементы главной диагонали:\n" +
                "%s\n";
        Random r = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(10) * (r.nextBoolean() ? 1 : -1);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] > 0) {
                    pozElements += matrix[i][j] + ", ";
                }
            }
        }
        if (pozElements.length() > 2) {
            pozElements = pozElements.substring(0, pozElements.length() - 2);
        } else {
            pozElements = " - ";
        }

        System.out.printf(report, matrixToString(matrix), pozElements);
    }

    private static String matrixToString(int[][] matrix) {
        String str = new String();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                str += String.format("%3d", matrix[i][j]);
            }
            str += "\n";
        }
        return str;
    }
}
