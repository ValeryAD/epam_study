package by.epam.study_project.unit2.mult_dim_arr;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
//По умолчанию строка и столбец выводятся не по индеску, а по порядковому номеру.
//Чтобы выводить по индексу установить offset = 0
public class Task3 {
    public static void main(String[] args) {
        final int n = 10;
        int k = 7;
        int p = 3;
        final int offset = 1;
        int[][] matrix = new int[n][n];
        final String report = "Матрица:\n" +
                "%s\n" +
                "К-я строка:\n" +
                "%s\n" +
                "p-й столбец:\n" +
                "%s\n";
        String row = new String();
        String column = new String();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < (matrix[k].length); i++) {
            row += String.format("%3d", matrix[k - offset][i]);
        }
        System.out.println();

        for (int i = 0; i < (matrix.length); i++) {
            column += String.format("%3d", matrix[i][p - offset]);
        }

        System.out.printf(report, matrixToString(matrix), row, column);
    }

    private static String matrixToString(int[][] matrix) {
        String result = new String();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result += String.format("%3d", matrix[i][j]);
            }
            result += "\n";
        }
        return result;
    }
}
