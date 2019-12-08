package by.epam.study_project.unit2.mult_dim_arr;

//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {
    public static void main(String[] args) {
        final int n = 10;
        int[][] matrix = new int[n][n];
        final String report = "Исходная матрица:\n" +
                "%s\n\n" +
                "матрица с отсортированными строками по возрастанию значений элементов:\n" +
                "%s\n\n" +
                "матрица с отсортированными строками по убыванию значений элементов:\n" +
                "%s\n\n";

        //инициализация массива
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
            }
        }
        String primeMatrixStr = matrixToString(matrix);

        //сортировка по возрастанию
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int min = matrix[i][j];
                int minInd = j;
                for (int k = j + 1; k < matrix[i].length; k++) {
                    if (min > matrix[i][k]) {
                        min = matrix[i][k];
                        minInd = k;
                    }
                }
                if (minInd != j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][minInd];
                    matrix[i][minInd] = temp;
                }
            }
        }

        String ascendRowSort = matrixToString(matrix);

        //сортировка по убыванию
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int max = matrix[i][j];
                int maxInd = j;

                for(int k = j + 1; k < matrix[i].length; k++){
                    if(max < matrix[i][k]){
                        max = matrix[i][k];
                        maxInd = k;
                    }
                }

                if(maxInd != j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][maxInd];
                    matrix[i][maxInd] = temp;
                }
            }
        }

        String descendRowSort = matrixToString(matrix);

        System.out.printf(report, primeMatrixStr, ascendRowSort, descendRowSort);
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
