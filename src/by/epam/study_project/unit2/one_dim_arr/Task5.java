package by.epam.study_project.unit2.one_dim_arr;

//5. Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.

public class Task5 {
    public static void main(String[] args) {

        final int n = 10;
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > i){
                sb.append(arr[i] + ", ");
            }
        }

        sb.delete(sb.length()-2, sb.length());

        System.out.println(sb);
    }
}