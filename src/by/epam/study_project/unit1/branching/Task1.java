package by.epam.study_project.unit1.branching;

/*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
        он прямоугольным.*/


public class Task1 {

    final public static int SUM_OF_ANGLES_OF_TRIANGLE = 180;
    final public static int RIGHT_ANGLE = 90;

    public static void main(String[] args) {

        int angle1 = 22;
        int angle2 = 58;
        boolean isExist = false;
        boolean isRight = false;
        final String report = "The triangle\n\t -exists: %s;\n\t -is right-angled: %s";
        final String wrongAngleValue = "Angle value should be positive and above 0";

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
