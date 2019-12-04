package by.epam.study_project.unit2.one_dim_arr;

/*
8. Дана последовательность целых чисел a1, a2, ... a. Образовать новую последовательность, выбросив из
        исходной те члены, которые равны min(a1, a2, ..., an);
*/
public class Task8 {
    public static void main(String[] args) {
        final int n = 20;
        int[] arr = new int[n];
        final String report = "Минимальное значение: %d, количество вхождений : %d\n" +
                "Исходная последовательность:\n" +
                "%s\n" +
                "Новая последовательность:\n" +
                "%s\n";
        // генерация последовательности
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }

        // поиск минимального значения и количества его вхождений
        int min = arr[0];
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min == arr[i]) {
                counter++;
            }
            if (arr[i] < min) {
                counter = 1;
                min = arr[i];
            }
        }
        // формирование нового массива, без минимальных значений
        int[] result = new int[arr.length - counter];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                result[j] = arr[i];
                j++;
            }
        }

        //Вывод результатов
        System.out.printf(report, min, counter, arrayToString(arr), arrayToString(result));
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

}
