package model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CollegeStudent that = (CollegeStudent) o;
        return currentYear == that.currentYear && Objects.equals(major, that.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), currentYear, major);
    }
}
