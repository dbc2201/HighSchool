package main;

import model.CollegeStudent;
import model.Person;
import model.Student;
import model.Teacher;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Divyansh", "Bhardwaj", "divyanshb22@gmail.com");
        System.out.println("person = " + person);
        JOptionPane.showMessageDialog(null, person, "Person Details", JOptionPane.PLAIN_MESSAGE);

        Student student = new Student(
                "divyansh",
                "bhardwaj",
                "divyanshb22@gmail.com",
                "Object-Oriented Programming",
                123456789L
        );
        System.out.println("student = " + student);
        JOptionPane.showMessageDialog(null, student, "Student Details", JOptionPane.PLAIN_MESSAGE);

        Teacher teacher = new Teacher(
                "Divyansh",
                "Bhardwaj",
                "divyanshb22@gmail.com",
                123456.789,
                "Object-Oriented Programming"
        );
        System.out.println("teacher = " + teacher);
        JOptionPane.showMessageDialog(
                null,
                teacher,
                "Teacher Details",
                JOptionPane.PLAIN_MESSAGE
        );

        CollegeStudent collegeStudent = new CollegeStudent(
                "divyansh",
                "bhardwaj",
                "divyanshb22@gmail.com",
                4,
                "Computer Science & Engineering"
        );
        System.out.println("collegeStudent = " + collegeStudent);
        JOptionPane.showMessageDialog(
                null,
                collegeStudent,
                "College Student Details",
                JOptionPane.PLAIN_MESSAGE
        );
    }
}
