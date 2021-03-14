package ab123Lesson10;
//making Teacher "final" means it cannot be extended by other classes.
//means it can have not children classes pulling from it
public final class Teacher extends Person {

    private String subject;

    public Teacher(String name, String lastName, int year, String subject) {
        super(name, lastName, year);

        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", subject='" + subject + '\'' +
                '}';
    }
}
