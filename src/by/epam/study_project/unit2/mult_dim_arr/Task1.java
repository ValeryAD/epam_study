package by.epam.study_project.unit2.mult_dim_arr;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1 {
    public static void main(String[] args) {
        final int n = 10;
        int[][] matrix = new int[n][n];
        final String fullMatrixReport;
        final String conditionalMatrixReport;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

        System.out.println("Полная матрица:");
        printMatrix(matrix, true);

        System.out.println("Только нечетные столбцы, c 1-м элементом больше последнего");
        printMatrix(matrix, false);
    }

    //вывод матрицы по условию задания/без условия
    private static void printMatrix(int[][] matrix, boolean withoutCondition) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                boolean odd = j % 2 == 0; //столбцы нечетные по порядку, а не по индексу
                boolean biggerFirstEl = matrix[0][j] > matrix[matrix.length - 1][j];
                if (withoutCondition || odd && biggerFirstEl) {
                    System.out.printf("%3d", matrix[i][j]);
                } else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
