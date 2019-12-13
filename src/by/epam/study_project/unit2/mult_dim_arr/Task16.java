package by.epam.study_project.unit2.mult_dim_arr;

 /*16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
        собой. Построить такой квадрат.*/

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        final int n = 4;
        int sum = (n * (n * n + 1)) / 2;

        int[][] matrix = generateMatrix(n);
        int[] array = matrixToOneDimArray(matrix);

        System.out.println(n);
        System.out.println(sum);
        System.out.println();
        System.out.println(matrixToString(matrix));
        System.out.println();
        printArray(array, n);
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println();


        //makePermutations(array.length, array, sum, n);
        heapPermutation(array, array.length, array.length, sum, n);

        /*System.out.println(isMagicByRows(array, sum, n));
        System.out.println(isMagicByColumns(array, sum, n));
        System.out.println(isMagicByMainDiag(array, sum, n));
        System.out.println(isMagicBySecondaryDiag(array, sum, n));
        System.out.println();
        System.out.println(isMagic(array, sum, n));
        System.out.println();
        printArray(array, n);*/

    }

    private static int[][] generateMatrix(int n) {
        //return new int[][]{{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
        int[][] result = new int[n][n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = ++counter;
            }
        }
        return result;
    }

    private static int[] matrixToOneDimArray(int[][] matrix) {
        int[] array = new int[matrix.length * matrix.length];
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                array[counter++] = matrix[i][j];
            }
        }
        return array;
    }

    private static void heapPermutation(int arr[], int size, int numb, int sum, int n) {
// if size becomes 1 then prints the obtained
// permutation
        if (size == 1) {
            if (isMagic(arr, sum, n)) {
                printArray(arr, n);
                //return;
            }
        }
        for (int i = 0; i < size; i++) {
            heapPermutation(arr, size - 1, numb, sum, n);
// if size is odd, swap first and last
// element
            if (size % 2 == 1) {
//swap(arr, arr[0], arr[size - 1]);
                int temp = arr[0];
                arr[0] = arr[size - 1];
                arr[size - 1] = temp;
            }
// If size is even, swap ith and last
// element
            else {
                int temp = arr[i];
                arr[i] = arr[size - 1];
                arr[size - 1] = temp;
            }
        }
    }

    //рандомный
    /*private static void makePermutations(int numb, int[] array, int sum, int n) {
        while(true) {
            int a = (int) (Math.random() * array.length);
            int b = (int) (Math.random() * array.length);
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
            if(isMagic(array,sum, n)){
                printArray(array, n);
                return;
            }
        }
    }*/

    //Heap's не рекурсивный
    /*private static void makePermutations(int numb, int[] array, int sum, int n) {
        int[] c = new int[numb];

        for (int i = 0; i < numb; i++) {
            c[i] = 0;
        }

        if(isMagic(array, sum, n)){
            printArray(array, n);
            //return;
        }

        int i = 0;
        while (i < numb) {
            if (c[i] < i) {
                if (i % 2 == 0) {
                    int temp = array[0];
                    array[0] = array[i];
                    array[i] = temp;
                } else {
                    int temp = array[c[i]];
                    array[c[i]] = array[i];
                    array[i] = temp;
                }
                if(isMagic(array, sum, n)){
                    printArray(array, n);
                    //return;
                }
                c[i]++;
                i = 0;
            } else {
                c[i] = 0;
                i++;
            }
        }
    }*/

    private static void printArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]);
            if ((i + 1) % n == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }


    private static boolean isMagic(int[] array, int sum, int n) {
        boolean answer;
        answer = isMagicByRows(array, sum, n) &&
                isMagicByColumns(array, sum, n) &&
                isMagicByMainDiag(array, sum, n) &&
                isMagicBySecondaryDiag(array, sum, n);
        return answer;
    }


    private static boolean isMagicByRows(int[] array, int sum, int n) {
        int counter = 0;
        int tempSum = 0;
        for (int i = 0; i < array.length; i++) {
            tempSum += array[i];
            if (++counter % n == 0) {
                if (tempSum != sum) {
                    return false;
                }
                tempSum = 0;
            }
        }
        return true;
    }


    private static boolean isMagicByColumns(int[] array, int sum, int n) {
        for (int offset = 0; offset < n; offset++) {
            int tempSum = 0;
            for (int i = 0; i < array.length; i += n) {
                tempSum += array[i + offset];

            }
            if (tempSum != sum) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMagicByMainDiag(int[] array, int sum, int n) {
        int offset = 1;
        int tempSum = 0;
        for (int i = 0; i < array.length; i += n + offset) {
            tempSum += array[i];
        }
        if (tempSum != sum) {
            return false;
        }
        return true;
    }

    private static boolean isMagicBySecondaryDiag(int[] array, int sum, int n) {
        int offset = -1;
        int tempSum = 0;
        for (int i = n + offset; i < array.length - n + 1; i += n + offset) {
            tempSum += array[i];
        }
        if (tempSum != sum) {
            return false;
        }
        return true;
    }

    private static String matrixToString(int[][] matrix) {
        String str = new String();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                str += String.format("%5d", matrix[i][j]);
            }
            str += "\n";
        }
        return str;
    }


}
