package by.epam.study_project.unit1.branching;

//2. Найти max{min(a, b), min(c, d)}.

public class Task2 {

    public static void main(String[] args) {
        int a = 75;
        int b = 78;
        int c = 42;
        int d = 22;

        if (a > b) {
            a = b;
        }

        if (c > d) {
            c = d;
        }

        if (a < d){
            a = d;
        }

        System.out.println(a);
    }
}
