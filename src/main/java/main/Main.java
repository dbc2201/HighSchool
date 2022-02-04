package main;

import model.Person;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Divyansh", "Bhardwaj", "divyanshb22@gmail.com");
        System.out.println("person = " + person);
        JOptionPane.showMessageDialog(null, person, "Person Details", JOptionPane.PLAIN_MESSAGE);
    }
}
