package by.epam.study_project.unit2.mult_dim_arr;

//7. Сформировать квадратную матрицу порядка N по правилу:
//и подсчитать количество положительных элементов в ней.

public class Task7 {
    public static void main(String[] args) {
        final int n = 10;
        int posCounter = 0;
        double[][] matrix = new double[n][n];
        final String report = "В матрице:\n" +
                "%s\n" +
                "Количество положительных элементов = %d\n";


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((i * i - j * j) / (double) n);
                if (matrix[i][j] > 0) {
                    posCounter++;
                }
            }
        }

        System.out.printf(report, matrixToString(matrix),posCounter);
    }

    private static String matrixToString(double[][] matrix) {
        String result = new String();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result += String.format("%10.5f", matrix[i][j]);
            }
            result += "\n";
        }
        return result;
    }
}
