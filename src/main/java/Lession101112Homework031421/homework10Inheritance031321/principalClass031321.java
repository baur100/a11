package Lession101112Homework031421.homework10Inheritance031321;

public class principalClass031321 extends personSuperClass031321 {

    private boolean principalCredentialEarned;
    private int yearPrincipalCredentialEarned;
    private String principalSchoolEmployed;
    private int principalSalary;


    public principalClass031321(String firstName, String lastName, String birthDate, String SSN, boolean principalCredentialEarned, int yearPrincipalCredentialEarned, String principalSchoolEmployed, int principalSalary) {
        super(firstName, lastName, birthDate, SSN);
        this.principalCredentialEarned = principalCredentialEarned;
        this.yearPrincipalCredentialEarned = yearPrincipalCredentialEarned;
        this.principalSchoolEmployed = principalSchoolEmployed;
        this.principalSalary = principalSalary;
    }

    public boolean isPrincipalCredentialEarned() {
        return principalCredentialEarned;
    }

    public void setPrincipalCredentialEarned(boolean principalCredentialEarned) {
        this.principalCredentialEarned = principalCredentialEarned;
    }

    public int getYearPrincipalCredentialEarned() {
        return yearPrincipalCredentialEarned;
    }

    public void setYearPrincipalCredentialEarned(int yearPrincipalCredentialEarned) {
        this.yearPrincipalCredentialEarned = yearPrincipalCredentialEarned;
    }

    public String getPrincipalSchoolEmployed() {
        return principalSchoolEmployed;
    }

    public void setPrincipalSchoolEmployed(String principalSchoolEmployed) {
        this.principalSchoolEmployed = principalSchoolEmployed;
    }

     public int getPrincipalSalary() {
        return principalSalary;
    }

    public void setPrincipalSalary(int principalSalary) {
        this.principalSalary = principalSalary;
    }

    @Override
    public String toString() {
        return "First Name: " + getFirstName() + " Last Name: " + getLastName() + " Birthdate: " + getBirthDate() + " SSN: " + getSSN() + " PrincipalCredentialEarned: " + principalCredentialEarned + " YearPrincipalCredentialEarned " +  yearPrincipalCredentialEarned + " PrincipalSchoolEmployed " + principalSchoolEmployed + " PrincipalSalary " + principalSalary;
    }


} //end of class
