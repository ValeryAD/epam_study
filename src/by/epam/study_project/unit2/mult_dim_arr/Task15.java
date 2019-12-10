package by.epam.study_project.unit2.mult_dim_arr;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {
    public static void main(String[] args) {
        int m = 15;
        int[][] matrix = new int[m][m];
        final String report = "Исходная матрица:\n" +
                "%s\n\n" +
                "матрица после замены нечетных элементов\n" +
                "%s\n\n";


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 1000);
            }
        }
        String primeMatrix = matrixToString(matrix);

        int maxValue = 0;
        for (int[] values : matrix) {
            for (int value : values) {
                if(maxValue < value){
                    maxValue = value;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] % 2 != 0){
                    matrix[i][j] = maxValue;
                }

            }
        }

        System.out.printf(report, primeMatrix, matrixToString(matrix));
    }

    private static String matrixToString(int[][] matrix) {
        String str = new String();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                str += String.format("%5d", matrix[i][j]);
            }
            str += "\n";
        }
        return str;
    }
}
