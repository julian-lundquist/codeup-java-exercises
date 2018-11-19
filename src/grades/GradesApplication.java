package grades;

import util.Input;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = getStudents();
    }

    public static HashMap<String, Student> getStudents() {
        Scanner sc = new Scanner(System.in);
        Input in = new Input(new Scanner(System.in));
        Student julian = new Student("Julian");
        Student alex = new Student("Alex");
        Student joe = new Student("Joe");
        julian.addGrade(82);
        julian.addGrade(88);
        julian.addGrade(93);
        alex.addGrade(70);
        alex.addGrade(88);
        alex.addGrade(93);
        joe.addGrade(70);
        joe.addGrade(65);
        joe.addGrade(93);

//        HashMap<String, String> students = new HashMap<>();
//        students.put("jlund1", julian.getInfo());
//        students.put("alex07", alex.getInfo());
//        students.put("joeman22", joe.getInfo());
        HashMap<String, Student> students = new HashMap<>();
        students.put("jlund1", julian);
        students.put("alex07", alex);
        students.put("joeman22", joe);

        String willContinue;

        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students:");
        for (String key : students.keySet()) {
            System.out.format("|%s| ", key);
        }
        do {
            System.out.format("%nWhat student would you like to see more information on?%n");

            String input = sc.next();

            if (students.containsKey(input)) {
                System.out.println(students.get(input).getInfo(input));
            }

            if (!students.containsKey(input)) {
                System.out.format("Sorry, no student found with the gihub username of \"%s\".%n", input);
            }

            System.out.println("Would you like to see another student? (y or any key to exit)");
        } while (in.yesNo());
        return students;
    }
}
