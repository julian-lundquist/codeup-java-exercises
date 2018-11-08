import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i < 15) {
//            System.out.println(i++);
//        }
//        System.out.println(i);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        int i = 0;
//        while (i < 100) {
//            ++i;
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("fizz buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner sc = new Scanner(System.in);
        String keepGoing = "y";

        while (keepGoing.equals("y")) {
            System.out.print("What number would you like to go up to? ");
            int userNumber = Integer.parseInt(sc.next());
            int number = 0;
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            do {
                ++number;
                int square = (int)(Math.pow(number, 2));
                int cube = (int)(Math.pow(number, 3));
                System.out.printf("%-7d| %-8d| %-7d%n", number, square, cube);
            } while (number < userNumber);

            System.out.print("Would you like to continue? (y or any key to exit) ");
            keepGoing = sc.next();
        }

//        Scanner sc = new Scanner(System.in);
//        String keepGoing;
//
//        do {
//            System.out.print("What is your Grade? ");
//            int grade = Integer.parseInt(sc.next());
//
//            if (grade <= 100 && grade >= 88) {
//                System.out.println("A");
//            } else if (grade <= 87 && grade >= 80) {
//                System.out.println("B");
//            } else if (grade <= 79 && grade >= 67) {
//                System.out.println("C");
//            } else if (grade <= 66 && grade >= 60) {
//                System.out.println("D");
//            } else if (grade <= 59 && grade >= 0) {
//                System.out.println("F");
//            }
//
//            System.out.print("Would you like to continue? (y or any key to exit) ");
//            keepGoing = sc.next();
//        } while (keepGoing.equals("y"));
    }
}
