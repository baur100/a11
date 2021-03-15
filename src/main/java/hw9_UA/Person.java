package hw9_UA;

public class Person {
    private String firstName;
    private String lastName;
    private int yearOfBirth;


    public void getPerson(){
        System.out.println("My best friend's name is " + firstName + " " + lastName + "." + " He was born in " + yearOfBirth + ".");
    }

    public Person(){
    }

    public Person(String firstName, String lastName, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setYearOfBirth(int year){
        if(year > 2021 || year < 1915){
            throw new IllegalArgumentException("Please, enter a valid year of birth.");
        }
        yearOfBirth = year;
    }

    public int getYearOfBirth(){
        return this.yearOfBirth;
    }

}
