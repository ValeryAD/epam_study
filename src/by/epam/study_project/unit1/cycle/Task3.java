package by.epam.study_project.unit1.cycle;

//3. Найти сумму квадратов первых ста чисел
public class Task3 {
    public static void main(String[] args) {
        int result = 0;
        final int upperLimit = 100;

        for (int i = 1; i <= upperLimit; i++) {
            result += (i * i);
        }

        System.out.println(result);
    }
}
