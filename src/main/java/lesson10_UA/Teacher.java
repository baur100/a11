package lesson10_UA;

public class Teacher extends Person {
    private String subject;

    public Teacher(String firstName, String lastName, int year, String subject) {
        super(firstName, lastName, year);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", subject='" + subject + '\'' +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
