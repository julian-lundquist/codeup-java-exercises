package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input in = new Input();
        System.out.println("Please enter a radius length.");
        double radius = in.getDouble(1, 10);
        Circle c = new Circle(radius);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }

}
