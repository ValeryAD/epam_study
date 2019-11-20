package by.epam.study_project.unit1.cycle;

//6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task6 {
    public static void main(String[] args) {
        final int charMaxValue = Character.MAX_VALUE;

        for (int i = 0; i <= charMaxValue; i++) {
            System.out.println(i + " - " + (char) i);
        }
    }
}
