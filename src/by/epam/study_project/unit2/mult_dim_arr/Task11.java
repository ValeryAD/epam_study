package by.epam.study_project.unit2.mult_dim_arr;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class Task11 {
    public static void main(String[] args) {
        final int n = 10;
        final int m = 20;
        final int maxVal = 15;
        final int numberToSeek = 5;
        final int meetTimes = 3;
        int[][] matrix = new int[n][m];
        String numbersOfRows = new String();
        String report = "Матрица: \n" +
                "%s\n" +
                "число 5 встречается три и более раз в строках со следующим индексом:\n" +
                "%s\n";

        for (int i = 0; i < matrix.length; i++) {
            int amount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * maxVal + 1);
                if (matrix[i][j] == numberToSeek) {
                    amount++;
                }
            }
            if (amount >= meetTimes) {
                numbersOfRows += i + ", ";
            }
        }
        if (numbersOfRows.length() > 2) {
            numbersOfRows = numbersOfRows.substring(0, numbersOfRows.length() - 2);
        } else {
            numbersOfRows = " - ";
        }

        System.out.printf(report, matrixToString(matrix), numbersOfRows);
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
