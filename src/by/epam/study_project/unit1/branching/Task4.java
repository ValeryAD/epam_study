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
        final String brick = String.format("Кирпич %dx%dx%d", x, y, z);
        final String hole = String.format("отверстие %dx%d", a, b);
        //final String pattern = " %sпройдет в отверстие %dx%d";
        final String posAns = " пройдет в ";
        final String negAns = " не пройдет в ";
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

        System.out.printf(brick + answer + hole);

    }
}
