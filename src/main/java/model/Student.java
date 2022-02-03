package model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(subject, student.subject) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject, rollNumber);
    }
}
