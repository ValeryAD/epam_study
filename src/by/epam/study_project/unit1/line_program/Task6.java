package by.epam.study_project.unit1.line_program;

import static java.lang.Math.abs;

 /*6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
        принадлежит закрашенной области, и false — в противном случае:*/

public class Task6 {
    public static void main(String[] args) {
        final String posAnswer = "true";
        final String negAnswer = "false";

        int x = -2;
        int y = 4;

        if (abs(x) > 4 || y > 4 || y < -3) {
            System.out.println(negAnswer);
        } else if (y > 0 && abs(x) > 2) {
            System.out.println(negAnswer);
        } else {
            System.out.println(posAnswer);
        }

    }
}
