package shapes;

import java.util.Scanner;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {

    }
}
