package model;

public class Teacher extends Person {

    private double salary;
    private String subject;

    public Teacher(String firstName, String lastName, String emailAddress, double salary, String subject) {
        super(firstName, lastName, emailAddress);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
