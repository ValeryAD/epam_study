package by.epam.study_project.unit1.cycle;

//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import static java.lang.Math.abs;

public class Task8 {
    public static void main(String[] args) {
        int x = 7;
        int y = 1356;
        int tempY = 0;
        int reminderX = 0;
        int reminderY = 0;
        final int base = 10;
        StringBuilder answer = new StringBuilder();


        do {
            reminderX = x % base;
            tempY = y;

            do {
                reminderY = tempY % base;
                if (reminderX == reminderY) {
                    answer.append(reminderY + ", ");
                }
                tempY /= base;
            } while (abs(tempY) >= 1);

            x /= base;
        } while (abs(x) >= 1);


        if (answer.length()>2) {
            answer.delete(answer.length()-2, answer.length());
        }
        System.out.println(answer);
    }

}
