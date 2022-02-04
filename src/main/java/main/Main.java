package main;

import model.Person;
import model.Student;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Divyansh", "Bhardwaj", "divyanshb22@gmail.com");
        System.out.println("person = " + person);
        JOptionPane.showMessageDialog(null, person, "Person Details", JOptionPane.PLAIN_MESSAGE);

        Student student = new Student("divyansh", "bhardwaj", "divyanshb22@gmail.com");
        System.out.println("student = " + student);
        JOptionPane.showMessageDialog(null, student, "Student Details", JOptionPane.PLAIN_MESSAGE);
    }
}
