package by.epam.study_project.unit2.mult_dim_arr;

//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task6 {

    public static void main(String[] args) {
        final int n = 12;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                //условия при которых каждый из 4-х треульников, образованных диагоналями, заполняется единицами
                boolean topLeft = matrix[i].length - 1 - j >= i;
                boolean bottomRight = matrix[i].length - 1 - j <= i;
                boolean topRight = j >= i;
                boolean bottomLeft = j <= i;

                if ((topRight || bottomRight) && (topLeft || bottomLeft)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
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
