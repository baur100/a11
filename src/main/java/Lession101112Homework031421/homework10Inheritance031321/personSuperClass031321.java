package Lession101112Homework031421.homework10Inheritance031321;

public class personSuperClass031321 {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String SSN;

    public personSuperClass031321(String firstName, String lastName, String birthDate, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getSSN() {
        return SSN;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    /* @Override   best way to print the class: add the print statement to the bottom of the 'subclasses" (ie principal, Student, teacher)
    public String toString() {
        return "personSuperClass031321{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    } */
} //end of class


