import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(add(3, 7));
        System.out.println(subtract(10, 3));
        System.out.println(multiply(5, 5));
        System.out.println(divide(20, 4));

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
//            continueNumber = sc.next();
//        }

        String continueInput = "y";
        int userInput;

        while (continueInput.equals("y")) {
            System.out.println("How many sides do you want your dice to have?");
            userInput = Integer.parseInt(sc.next());
            int rand = (int)(Math.random() * userInput) + 1;
            System.out.printf("The number that you have rolled is %d on a %d sided dice%n", rand, userInput);
            System.out.println("Would you like to try again? (y to continue or any key to exit)");
            continueInput = sc.next();
        }
    }


    public static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }

    public static int add (int num1, int num2) {
        return num1 + num2;
    }
    public static int subtract (int num1, int num2) {
        return num1 - num2;
    }
    public static int multiply (int num1, int num2) {
        return num1 * num2;
    }
    public static int divide (int num1, int num2) {
        return num1 / num2;
    }
}
