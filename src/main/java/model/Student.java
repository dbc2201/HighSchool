package model;

public class Student extends Person {

    private String subject;
    private String rollNumber;

    public Student(String firstName, String lastName, String emailAddress) {
        super(firstName, lastName, emailAddress);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
