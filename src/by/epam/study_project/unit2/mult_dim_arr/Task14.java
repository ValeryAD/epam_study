package by.epam.study_project.unit2.mult_dim_arr;

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

public class Task14 {
    public static void main(String[] args) {
        final int m = (int) (Math.random() * 20 + 5);
        final int n = (int) (Math.random() * 20 + 5);
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j >= i) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
