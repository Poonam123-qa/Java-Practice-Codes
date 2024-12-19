package Encapsulation;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades.
// Provide public getter and setter methods to access and modify the student_id and student_name variables.
//However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.
public class Student {

    private int studid;
    private String studname;
    private List grades;


    public int getStudid() {
        return studid;
    }

    public void setStudid(int studid) {
        this.studid = studid;
    }

    public String getStudname() {
        return studname;
    }

    public void setStudname(String studname) {
        this.studname = studname;
    }

    public List getGrade() {
        return grades;
    }
    public void addGrade(double grade) {
        // Initialize the grades list if it is null
        if (grades == null) {
            grades = new ArrayList<>();
        }
        // Add the grade to the grades list
        grades.add(grade);
    }
}

class main{
    public static void main(String args[]){
            // Create an instance of Student
            Student student = new Student();

            // Set the values using the setter methods
            student.setStudid(1);
            student.setStudname("Nadia Hyakinthos");

            // Add grades using the addGrade() method
            student.addGrade(92.5);
            student.addGrade(89.0);
            student.addGrade(90.3);

            // Get the values using the getter methods
            int student_id = student.getStudid();
            String student_name = student.getStudname();
        List<Double> grades = student.getGrade();

            // Print the values
            System.out.println("Student ID: " + student_id);
            System.out.println("Student Name: " + student_name);
            System.out.println("Grades: " + grades);

    }
}
