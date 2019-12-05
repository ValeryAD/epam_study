package by.epam.study_project.unit2.mult_dim_arr;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task3 {
    public static void main(String[] args){
        int size = 10;
        int k = 4;
        int p = 6;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

        for (int i = 0; i < matrix[k].length; i++) {
            System.out.printf("%3d", matrix[k][i]);
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++){
            System.out.printf("%3d", matrix[i][p]);
        }
        System.out.println();
        System.out.println();
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
