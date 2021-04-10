package simpleInheritance040921;

public class simpleInheritanceTeacherClass040921040921 extends simpleInheritancePersonClass040921 {
    private String teacherSubjectTeaching;
    private String teacherSchoolTeaching;
    private boolean teacherCredentialled;

    public simpleInheritanceTeacherClass040921040921(String personFirstName, String personLastName, Integer personAge, String teacherSubjectTeaching, String teacherSchoolTeaching, Boolean teacherCredentialled) {
        super(personFirstName, personLastName, personAge);
        this.teacherSubjectTeaching = teacherSubjectTeaching;
        this.teacherCredentialled = teacherCredentialled;
        this.teacherSchoolTeaching = teacherSchoolTeaching;
        //add local instances below in order to print them

    }

    @Override
    /* public String toString() {
        return "simpleInheritanceTeacherClass040921040921{" +
               "teacherSubjectTeaching='" + teacherSubjectTeaching + '\'' +
                ", teacherSchoolTeaching='" + teacherSchoolTeaching + '\'' +
                ", teacherCredentialled=" + teacherCredentialled +
                '}';
    } */

    public String toString() {

        return "simpleInheritanceTeacherClass040921040921: " + getPersonFirstName().toString() + " " + getPersonLastName().toString() + " " +getPersonAge().toString() + " " + teacherSubjectTeaching + " " + teacherSchoolTeaching + "Credentialled? " + teacherCredentialled;
    }
} //end of class
