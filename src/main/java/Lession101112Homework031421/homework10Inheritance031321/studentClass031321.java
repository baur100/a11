package Lession101112Homework031421.homework10Inheritance031321;

public class studentClass031321 extends personSuperClass031321{

    private String courseEnrolled;
    private int studentRanking;

    public studentClass031321(String firstName, String lastName, String birthDate, String SSN, String courseEnrolled, int studentRanking) {
        super(firstName, lastName, birthDate, SSN);
        this.courseEnrolled = courseEnrolled;
        this.studentRanking = studentRanking;
    }

    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    public int getStudentRanking() {
        return studentRanking;
    }

    public void setStudentRanking(int studentRanking) {
        this.studentRanking = studentRanking;

    }

       @Override
       public String toString() {
           return "First Name: " + getFirstName() + " Last Name: " + getLastName() + " Birthdate: " + getBirthDate() + " SSN: " + getSSN() + " Course Enrolled: " + courseEnrolled + " Student Ranking: " + studentRanking;

       }


} //end of class

