import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();
        boolean question = sentence.endsWith("?");
        boolean exclamation = sentence.endsWith("!");
        boolean noSpace = sentence.equals("");

        if (question) {
            System.out.println("Sure");
        } else if (exclamation) {
            System.out.println("Whoa, chill out!");
        } else if (noSpace) {
            System.out.println("Fine, be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}
