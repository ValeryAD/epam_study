package by.epam.study_project.unit1.line_program;

import static java.lang.Math.abs;

 /*6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
        принадлежит закрашенной области, и false — в противном случае:*/

public class Task6 {
    public static void main(String[] args) {
        boolean isBelong;
        int x = -2;
        int y = 4;



        isBelong = abs(x) <= 4 && y <= 0 && y >= -3;
        isBelong = isBelong || y > 0 && y <= 4 && abs(x) <= 2;

        System.out.println(isBelong);

    }
}
