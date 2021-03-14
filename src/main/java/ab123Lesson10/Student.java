package ab123Lesson10;

import java.util.Arrays;
//adding extends Person makes this class take values from Person
//so we deleted the repeated values of name lastname and year
//because Student now pulls those values from Person

public class Student extends Person {

    private String major;
    private String[] subjects;

    public Student(String name, String lastName, int year, String major, String[] subjects) {
    super(name, lastName, year);

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
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", major='" + major + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
