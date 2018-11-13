package util;

import java.util.Scanner;

public class Input {
    private Scanner scn = new Scanner(System.in);
    public String getString() {
        return scn.next();
    }

    public boolean yesNo() {
        String userInput = getString();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            System.out.println("yup");
            return true;
        }
        System.out.println("nope");
        return false;
    }

    public int getInt(int min, int max) {
        System.out.println("Enter an Integer");
        if (!scn.hasNextInt()) {
            System.out.println("Not a number!");
            return getInt(min, max);
        }
        int userInput = scn.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println(userInput + " In range!");
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInt(min, max);
        }
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a Double");
        if (!scn.hasNextDouble()) {
            System.out.println("Not a number!");
            return getDouble(min, max);
        }
        double userInput = scn.nextDouble();
        if (userInput >= min && userInput <= max) {
            System.out.println(userInput + " In range!");
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getDouble(min, max);
        }
    }

    public static void main(String[] args) {

    }
}
