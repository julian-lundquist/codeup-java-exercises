package grades;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
    private String name;
    ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double gradeTotal = 0;
        for (int i = 0; i < grades.size(); i += 1) {
            gradeTotal += grades.get(i);
        }
        return gradeTotal / (grades.size());
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Student julian = new Student("Julian");
        julian.addGrade(82);
        julian.addGrade(88);
        julian.addGrade(93);
        System.out.println(df.format(julian.getGradeAverage()));

    }
}
