package model;

public class Teacher extends Person {

    private double salary;
    private String subject;

    public Teacher(String firstName, String lastName, String emailAddress) {
        super(firstName, lastName, emailAddress);
    }
}
