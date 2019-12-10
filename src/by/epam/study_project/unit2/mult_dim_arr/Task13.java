package by.epam.study_project.unit2.mult_dim_arr;

//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task13 {
    public static void main(String[] args) {
        final int n = 10;
        int[][] matrix = new int[n][n];
        final String report = "Исходная матрица:\n" +
                "%s\n\n" +
                "матрица с отсортированными столбцами по возрастанию значений элементов:\n" +
                "%s\n\n" +
                "матрица с отсортированными столбцами по убыванию значений элементов:\n" +
                "%s\n\n";

        //заполнение матрицы значениями
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
            }
        }

        String primeMatrixStr = matrixToString(matrix);

        //сортировка столбцов в порядке возрастания
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                int min = matrix[i][j];
                int minInd = i;
                for (int k = i + 1; k < matrix.length; k++) {
                    if (min > matrix[k][j]) {
                        min = matrix[k][j];
                        minInd = k;
                    }
                }
                if (minInd != i) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[minInd][j];
                    matrix[minInd][j] = temp;
                }

            }
        }

        String ascendColumnSort = matrixToString(matrix);

        //сортировка столбцов в порядке убывания
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int k = 0; k < matrix.length - i - 1; k++) {
                    if (matrix[k][j] < matrix[k + 1][j]) {
                        int temp = matrix[k][j];
                        matrix[k][j] = matrix[k + 1][j];
                        matrix[k + 1][j] = temp;
                    }
                }
            }
        }


        String descendColumnSort = matrixToString(matrix);

        System.out.printf(report, primeMatrixStr, ascendColumnSort, descendColumnSort);

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


