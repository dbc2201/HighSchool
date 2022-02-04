package model;

public class CollegeStudent extends Student {

    private int currentYear;
    private String major;

    public CollegeStudent(String firstName, String lastName, String emailAddress) {
        super(firstName, lastName, emailAddress);
    }
}
