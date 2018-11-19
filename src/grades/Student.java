package grades;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
    private String name;
    ArrayList<Double> grades;
    DecimalFormat df = new DecimalFormat("#.00");

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
    public void addGrade(double grade) {
        this.grades.add(grade);
    }
    public String getInfo(String gitName) {
        String output = String.format("Name: %s - Gihub Username: %s%nCurrent Average: %s%n", getName(), gitName, df.format(getGradeAverage()));
        return output;
    }

    public double getGradeAverage() {
        double gradeTotal = 0;
        for (int i = 0; i < this.grades.size(); i += 1) {
            gradeTotal += this.grades.get(i);
        }
        return gradeTotal / (this.grades.size());
    }

    public static void main(String[] args) {
        Student julian = new Student("Julian");
        julian.addGrade(82);
        julian.addGrade(88);
        julian.addGrade(93);
    }
}
