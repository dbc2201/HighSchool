package model;

public class Student extends Person {

    private String subject;
    private String rollNumber;

    public Student(String firstName, String lastName, String emailAddress) {
        super(firstName, lastName, emailAddress);
    }
}
