package by.epam.study_project.unit2.one_dim_arr;

/**
 * Created by Администратор on 03.12.2019.
 */
public class Task6 {
    /*6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
    являются простыми числами.*/

    public static void main(String[] args) {
        final int n = 10;
        double[] arr = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}; //TODO сгенерировать массив
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            if(isPrime(i)){
                result += arr[i];
            }
        }

        System.out.println(result);
    }


    public static boolean isPrime(int n){

        if(n == 0 || n == 1){
            return false;
        }

        boolean b = true;
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                b = false;
                break;
            }
        }
        return b;
    }
}
