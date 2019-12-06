package by.epam.study_project.unit2.mult_dim_arr;

//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task4 {
    public static void main(String[] args) {
        final int n = 10;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j;
                } else {
                    matrix[i][j] = matrix[i].length - 1 - j;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
