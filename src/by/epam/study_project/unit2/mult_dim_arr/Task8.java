package by.epam.study_project.unit2.mult_dim_arr;

//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.


//указывать порядковые номера столбцов, а не индексы!
//Для того чтобы указывать индексы установить offset = 0
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        final int n = 10;
        int[][] matrix = new int[n][n];
        int column1 = 0;
        int column2 = 0;
        final int offset = 1;
        final String report = "Исходная матрица:\n" +
                "%s\n" +
                "Измененная матрица:\n" +
                "%s\n";
        final String column1InputRequest =
                String.format("Введите номер 1-го столбца (от %d до %d)", 0 + offset, matrix.length - 1 + offset);
        final String column2InputRequest =
                String.format("Введите номер 2-го столбца (от %d до %d)", 0 + offset, matrix.length - 1 + offset);
        final String wrongInput = "Неверный ввод: ";
        final String wrongInputNotInt = "введено не целое число";
        final String wrongInputInvalidSize = "введенное значение не соответствует размерам матрицы";
        Scanner sc = new Scanner(System.in);


        //Получение данных от пользователя
        System.out.println(column1InputRequest);
        boolean isNotCorrectUserData;
        do {
            isNotCorrectUserData = true;
            while (!sc.hasNextInt()) {
                System.out.println(wrongInput + wrongInputNotInt + "\n" + column1InputRequest);
                sc.next();
            }
            column1 = sc.nextInt();
            if (column1 - offset > matrix.length - 1 || column1 - offset < 0) {
                System.out.println(wrongInput + wrongInputInvalidSize);
                continue;
            }
            isNotCorrectUserData = false;
        } while (isNotCorrectUserData);


        do {
            isNotCorrectUserData = true;
            System.out.println(column2InputRequest);
            while (!sc.hasNextInt()) {
                System.out.println(wrongInput + wrongInputNotInt + "\n" + column2InputRequest);
                sc.next();
            }
            column2 = sc.nextInt();
            if (column2 - offset > matrix.length || column2 - offset < 0) {
                System.out.println(wrongInput + wrongInputInvalidSize + "\n" + column2InputRequest);
                continue;
            }

            isNotCorrectUserData = false;
        } while (isNotCorrectUserData);


        //Заполнение матрицы случайными значениями
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

        String primeMatrix = matrixToString(matrix); //сохранение текущего состояния матрицы в строку

        //Перестановка столбцов
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][column1 - offset];
            matrix[i][column1 - offset] = matrix[i][column2 - offset];
            matrix[i][column2 - offset] = temp;
        }

        //вывод результата
        System.out.printf(report, primeMatrix, matrixToString(matrix));

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
