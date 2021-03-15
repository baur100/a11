package Lession101112Homework031421.homework10Inheritance031321;

public class teacherClass031321 extends personSuperClass031321{

    private boolean teacherCredentialEarned;
    private int yearTeacherCredentialEarned;
    private String teacherSchoolEmployed;
    private String subjectTeaching;

    public teacherClass031321(String firstName, String lastName, String birthDate, String SSN, boolean teacherCredentialEarned, int yearTeacherCredentialEarned, String teacherSchoolEmployed, String subjectTeaching) {
        super(firstName, lastName, birthDate, SSN);
        this.teacherCredentialEarned = teacherCredentialEarned;
        this.yearTeacherCredentialEarned = yearTeacherCredentialEarned;
        this.teacherSchoolEmployed = teacherSchoolEmployed;
        this.subjectTeaching = subjectTeaching;
    }


    public int getYearTeacherCredentialEarned() {
        return yearTeacherCredentialEarned;
    }

    public void setYearTeacherCredentialEarned(int yearTeacherCredentialEarned) {
        this.yearTeacherCredentialEarned = yearTeacherCredentialEarned;
    }

    public String getTeacherSchoolEmployed() {
        return teacherSchoolEmployed;
    }

    public void setTeacherSchoolEmployed(String teacherSchoolEmployed) {
        this.teacherSchoolEmployed = teacherSchoolEmployed;
    }

    public String getsubjectTeaching() {
        return subjectTeaching;
    }

    public void setsubjectTeaching(String subjectTeaching) {
        this.subjectTeaching = subjectTeaching;
    }


        @Override
        public String toString() {
            //return "First Name: " + getFirstName() + " Last Name: " + getLastName() + " Birthdate: " + getBirthDate() + " SSN: " + getSSN() + " Course Enrolled: " + courseEnrolled + " Student Ranking: " + studentRanking;

            return "First Name: " + getFirstName() + " Last Name: " + getLastName() + " Birthdate: " + getBirthDate() + " SSN: " + getSSN() + " TeacherSchoolEmployed: " + teacherSchoolEmployed +  " CredentialEarned: " +teacherCredentialEarned + " YearCredentialEarned: " + yearTeacherCredentialEarned + " TeacherSchoolEmployed: " +teacherSchoolEmployed + " SubjectTeaching: " + subjectTeaching;
        }
}//end of class
