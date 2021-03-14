package ab123Lesson9;

public class Person {
    private String name;
    private String lastName;
    private int yearOfBirth;
    //constructor has same name as the class, no need for private constructor
    public Person(String name, String lastName, int yearOfBirth){
        this.name = name;
        this.lastName=lastName;
        this.yearOfBirth=yearOfBirth;
    }
    //empty constructor
    public Person(){

    }
    //constructor but missing some information
    public Person (String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }


    public String getName() {
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setLastName(String l){
        lastName = l;
    }
    public String getLastName() {
        return lastName;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void setYearOfBirth(int year) {
        if (year > 2021 || year < 1900){
            throw new IllegalArgumentException("Wrong age");
        }
        yearOfBirth=year;
    }
}
