package by.epam.study_project.unit2.one_dim_arr;

/*9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
        чисел несколько, то определить наименьшее из них.*/

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 5, 3, 2, 2, 3, 3, 3, 2, 2, 2};

        int[] meetingAmount = new int[arr.length]; // В этом массиве будем хранить количество встреч

        //подсчет количества повторений
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
        int maxMeetAmount = 0; // наибольшее количество встреч

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

        System.out.println(mostCommonNumber);
    }

}
