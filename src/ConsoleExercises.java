import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is %.2f\n", pi);

        Scanner sc = new Scanner(System.in);

//        System.out.println("Please enter an integer");
//        int age = sc.nextInt();
//        System.out.println(age);
//        System.out.println("Please enter first, middle, and last name");
//        String firstName = sc.next();
//        String middleName = sc.next();
//        String lastName = sc.next();
//        System.out.println("The name you input is " + firstName + " " + middleName + " " + lastName);

//        System.out.println("Please enter a sentence");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);

        System.out.println("Enter the Length then the width of the room");

        double l = Double.parseDouble(sc.nextLine());
        double w = Double.parseDouble(sc.nextLine());

        System.out.printf("The area of the room is " + (l * w) + " and the perimeter is " + ((l * 2) + (w * 2)));
    }
}
