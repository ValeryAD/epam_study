package by.epam.study_project.unit2.one_dim_arr;

/*10. Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
        элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/

public class Task10 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        String report = "Исходный массив: \n" +
                "%s\n" +
                "Новый массив:\n" +
                "%s\n";

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        String oldArrStr = arrayToString(arr);

        int newArrayLength = arr.length - arr.length / 2;
        int cursor = 0;

        //последовательно копируем значения с четными индексами в позицию курсора
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[cursor] = arr[i];
                cursor++;
            }
            //все что больше последнего индекса нового массива зануляется
            if (arr[i] > newArrayLength - 1) {
                arr[i] = 0;
            }
        }

        System.out.printf(report, oldArrStr, arrayToString(arr));
    }

    private static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i : arr){
            sb.append(i + ", ");
        }

        sb.delete(sb.length()-2, sb.length());
        sb.append("]");
        return sb.toString();
    }
}
