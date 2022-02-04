package model;

public class Teacher extends Person {

    private double salary;
    private String subject;

    public Teacher(String firstName, String lastName, String emailAddress, double salary, String subject) {
        super(firstName, lastName, emailAddress);
        this.salary = salary;
        this.subject = subject;
    }
}
