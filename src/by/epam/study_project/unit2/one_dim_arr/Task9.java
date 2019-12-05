package by.epam.study_project.unit2.one_dim_arr;

/*9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
        чисел несколько, то определить наименьшее из них.*/

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 5, 3, 2, 2, 3, 3, 3, 2, 2, 2};
        String report = "В массиве: \n" +
                "%s\n" +
                "наименьшее наиболее часто встречающееся число: %d";

        int[] meetingAmount = new int[arr.length]; // В этом массиве будем хранить количество вхождений

        //подсчет количества вхождений
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            meetingAmount[i] = count;
        }

        int mostCommonNumber = 0;// наиболее часто встречающееся число
        int maxMeetAmount = 0; // наибольшее количество вхождений

        //определение наиболее часто встречающегося числа
        for (int i = 0; i < meetingAmount.length; i++) {
            if (maxMeetAmount < meetingAmount[i]) {
                maxMeetAmount = meetingAmount[i];
                mostCommonNumber = arr[i];
            } else if (maxMeetAmount == meetingAmount[i]) { //если кол-во повторений одинаковое, выбираем меньшее число
                if (arr[i] < mostCommonNumber) {
                    mostCommonNumber = arr[i];
                }
            }
        }

        //вывод результата
        System.out.printf(report, arrayToString(arr), mostCommonNumber);
    }

    private static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i : arr) {
            sb.append(i + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

}
