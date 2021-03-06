import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(add(3, 7));
        System.out.println(subtract(10, 3));
        System.out.println(multiply(5, 5));
        System.out.println(divide(20, 4));
        System.out.println(modulus(100, 2));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("Your integer is: " + userInput);

        inputFactorial(sc);

        rollDiceGame(sc);

//        String continueInput = "y";
//        int userInput;
//
//        while (continueInput.equals("y")) {
//            System.out.print("Enter a number between 1 and 10: ");
//            userInput = Integer.parseInt(sc.next());
//            if (userInput >= 1 && userInput <= 10) {
//                System.out.println(userInput);
//                int num = userInput;
//                System.out.println("Factorial of "+ num + " is " + factorial(num));
//            } else {
//                System.out.println("That number is not between 1-10.");
//            }
//            System.out.println("Would you like to try again? (y to continue or any key to exit)");
//            continueInput = sc.next();
//        }
//
//        String continueInput2 = "y";
//        int userInput2;
//
//        while (continueInput2.equals("y")) {
//            System.out.println("How many sides do you want your dice to have?");
//            userInput2 = Integer.parseInt(sc.next());
//            int rand = (int)(Math.random() * userInput2) + 1;
//            System.out.printf("The number that you have rolled is %d on a %d sided dice%n", rand, userInput2);
//            System.out.println("Would you like to try again? (y to continue or any key to exit)");
//            continueInput2 = sc.next();
//        }
    }


    public static long calcFactorial(int num) {
        int output = 1;
        for (int i = 1; i <= num; i += 1) {
            output *= i;
        }
        return output;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max);
        }
    }

    public static void inputFactorial(Scanner sc) {
        boolean keepGoing;
        String userChoice;
        do {
            System.out.println("Please enter an integer from 1 to 12");
            int userInt = getInteger(1, 12);
            System.out.println(calcFactorial(userInt));
            do {
                System.out.println("Do you wish to continue? [y/n]: ");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

            keepGoing = userChoice.equalsIgnoreCase("y");
        } while (keepGoing);
    }

    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void rollDiceGame(Scanner sc) {
        String userChoice;
        System.out.print("Please enter the number of sides for the dice: ");
        int nSides = getInteger(1, 20);
        do {
            System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
            do {
                System.out.println("Would you like to roll again? [y/n]");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

        } while (!userChoice.equals("n"));
    }

    public static double add (double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract (double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply (double num1, double num2) {
        return num1 * num2;
    }
    public static int multiply2 (int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 + multiply2(num1, num2 - 1);
    }
    public static double divide (double num1, double num2) {
        return num1 / num2;
    }
    public static double modulus(double num1, double num2) { return num1 % num2; }
}
