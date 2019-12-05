package by.epam.study_project.unit2.mult_dim_arr;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {
    public static void main(String[] args) {
        int size = 10;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j){
                    System.out.printf("%3d", matrix[i][j]);
                }
            }
        }
    }
}
