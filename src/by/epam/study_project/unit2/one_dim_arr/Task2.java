package by.epam.study_project.unit2.one_dim_arr;

/*2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.*/

public class Task2 {
    public static void main(String[] args) {
        double[] arr = new double[15];
        double z = 22.0;
        int counter = 0;
        final String report = "Количество замен %d\n" +
                "отредактированный массив:\n" +
                "%s";

        //генерация значений массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * i + 1 / Math.pow(2, i);
        }

        // замена значений по условию
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                counter++;
            }
        }

        //вывод
        System.out.printf(report, counter, arrayToString(arr));

    }

    public static String arrayToString(double[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (double d : arr) {
            sb.append(d + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(']');

        return sb.toString();
    }
}



