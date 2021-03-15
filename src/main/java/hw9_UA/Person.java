package hw9_UA;

public class Person {
    private String firstName;
    private String lastName;
    private int yearOfBirth;

    public void setFirstName(String fn){
        firstName = fn;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String ln){
        lastName = ln;
    }
    public String getLastName(){
        return lastName;
    }
    public void setYearOfBirth(int year){
        if(year > 2021 || year < 1915){
            throw new IllegalArgumentException("Please, enter a valid year of birth.");
        }
        yearOfBirth = year;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
}
