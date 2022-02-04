package model;

public class CollegeStudent extends Student {

    private int currentYear;
    private String major;

    public CollegeStudent(String firstName, String lastName, String emailAddress, int currentYear, String major) {
        super(firstName, lastName, emailAddress);
        this.currentYear = currentYear;
        this.major = major;
    }
}
