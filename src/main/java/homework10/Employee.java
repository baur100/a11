package homework10;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected int yearJoined;
    protected boolean employed;

    public Employee(String firstName, String lastName, int yearJoined, boolean employed){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearJoined = yearJoined;
        this.employed = employed;
    }

    public Employee(){}

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lname){
        this.lastName = lname;
    }

    public int getYearJoined(){
        return yearJoined;
    }

    public void setYearJoined(int yjoined){
        this.yearJoined = yjoined;
    }

    public boolean getEmployed(){
        return employed;
    }

    public void setEmployed(boolean employed){
        this.employed = employed;
    }
}
