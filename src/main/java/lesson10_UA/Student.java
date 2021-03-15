package lesson10_UA;

import java.util.Arrays;

public class Student extends Person {
    private String major;
    private String[] subjects;

    public Student(String firstName, String lastName, int year, String major, String[] subjects) {
        super(firstName,lastName,year);
        this.major = major;
        this.subjects = subjects;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", major='" + major + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
