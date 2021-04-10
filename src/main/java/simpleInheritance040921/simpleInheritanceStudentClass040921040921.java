package simpleInheritance040921;

public class simpleInheritanceStudentClass040921040921 extends simpleInheritancePersonClass040921 {
    private String courseStudentEnrolled;
    private String schoolStudentEnrolled;

    public simpleInheritanceStudentClass040921040921(String personFirstName, String personLastName, Integer personAge, String courseStudentEnrolled, String schoolStudentEnrolled) {
        super(personFirstName, personLastName, personAge);
        this.courseStudentEnrolled = courseStudentEnrolled;
        this.schoolStudentEnrolled = schoolStudentEnrolled;
    }

    @Override
    public String toString() {
        return "simpleInheritanceStudentClass040921040921: " + getPersonFirstName().toString() + " " + getPersonLastName().toString() + " " +getPersonAge().toString() + " " + courseStudentEnrolled + " " + schoolStudentEnrolled ;
    }
}
