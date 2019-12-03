package by.epam.study_project.unit2.one_dim_arr;

//4. Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.

public class Task4 {
    public static void main(String[] args) {
        final int n = 10;
        double[] arr = new double[n];
        int min_ind = 0;
        int max_ind = 0;
        final String report = "Было:\n" +
                "%s\n" +
                "стало:\n" +
                "%s";
        final String arrPrimeryState;

        //генерация значений массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 1000;
        }

        arrPrimeryState = arrayToString(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[min_ind] > arr[i]) {
                min_ind = i;
            }

            if (arr[max_ind] < arr[i]) {
                max_ind = i;
            }
        }

        double temp = arr[min_ind];
        arr[min_ind] = arr[max_ind];
        arr[max_ind] = temp;

        System.out.printf(report, arrPrimeryState, arrayToString(arr));
    }

    public static String arrayToString(double[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");

        return sb.toString();
    }
}
