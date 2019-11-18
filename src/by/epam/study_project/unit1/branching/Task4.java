package by.epam.study_project.unit1.branching;

/*4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
        отверстие.*/

public class Task4 {
    public static void main(String[] args) {
        int a = 121;
        int b = 66;
        int x = 250;
        int y = 120;
        int z = 65;
        final String pattern = "It %s possible to pull the brick through the hole";
        final String posAns = "is";
        final String negAns = "is not";
        String answer = negAns;


        if (y < x) {
            x = y;
        }

        if (z < y) {
            y = z;       //Теперь x и y меньшие измерения кирпича
        }

        if (a > x & b > y || a > y && b > x) {
            answer = posAns;
        }

        System.out.printf(pattern, answer);

    }
}
