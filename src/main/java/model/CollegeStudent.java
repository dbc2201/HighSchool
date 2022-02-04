package model;

public class CollegeStudent extends Student {

    private int currentYear;
    private String major;

    public CollegeStudent(String firstName, String lastName, String emailAddress, int currentYear, String major) {
        super(firstName, lastName, emailAddress);
        this.currentYear = currentYear;
        this.major = major;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
