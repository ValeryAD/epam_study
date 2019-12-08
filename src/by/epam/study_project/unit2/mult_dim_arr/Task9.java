package by.epam.study_project.unit2.mult_dim_arr;

//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class Task9 {
    public static void main(String[] args) {
        final int n = 10;
        int[][] matrix = new int[n][n];
        int[] columnSum = new int[matrix.length];
        int maxValue = 0;
        int maxValueInd = 0;
        final String report = "Матрица:\n" +
                "%s\n\n" +
                "суммы элементов каждого столбца:\n" +
                "%s\n\n" +
                "индекс столбца с максимальной суммой:\n" +
                "%d\n";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                columnSum[j] += matrix[i][j];
            }
        }

        String columnSumStr = new String();
        for (int i = 0; i < columnSum.length; i++) {
            columnSumStr += columnSum[i] + ", ";
            if(columnSum[i] > maxValue){
                maxValue = columnSum[i];
                maxValueInd = i;
            }
        }
        columnSumStr = columnSumStr.substring(0, columnSumStr.length()-2);

        System.out.printf(report,matrixToString(matrix), columnSumStr, maxValueInd);
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
