package by.epam.study_project.unit1.branching;

//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task3 {
    public static void main(String[] args) {
        final String report = "The points %s the same line";
        final String positAns = "belong";
        final String negAns = "doesn't belong";

        Point a = new Point(2, 2);
        Point b = new Point(10, 10);
        Point c = new Point(7, 7);

        int exp1 = (c.getX() - b.getX()) * (a.getY() - b.getY());
        int exp2 = (a.getX() - b.getX()) * (c.getY() - b.getY());

        System.out.printf(report, exp1 == exp2 ? positAns : negAns);
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}