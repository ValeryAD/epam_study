package by.epam.study_project.unit1.branching;

/*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
        он прямоугольным.*/


public class Task1 {

    final public static int SUM_OF_ANGLES_OF_TRIANGLE = 180;
    final public static int RIGHT_ANGLE = 90;

    public static void main(String[] args) {

        int angle1 = 22;
        int angle2 = 68;
        boolean isExist = false;
        boolean isRight = false;
        final String report = "Треугольник, с указанными углами \n\t - существует: %s;\n\t - является прямоугольным: %s";
        final String wrongAngleValue = "Угол треугольника должен быть больше 0";

        if (angle1 <= 0 || angle2 <= 0){
            System.out.println(wrongAngleValue);
            System.exit(0);
        }

        if((angle1 + angle2) < SUM_OF_ANGLES_OF_TRIANGLE){
            isExist = true;
        }

        if(angle1 == RIGHT_ANGLE || angle2 == RIGHT_ANGLE || angle1+angle2 == RIGHT_ANGLE){
            isRight = true;
        }

        System.out.printf(report,isExist,isRight);
    }
}
