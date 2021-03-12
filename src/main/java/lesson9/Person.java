package lesson9;

public class Person {
    private String name;
    private String lastName;
    private int yearOfBirth;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setLastName(String l){
        lastName=l;
    }
    public String getLastName(){
        return lastName;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void setYearOfBirth(int year){
        if(year>2021||year<1900){
            throw new IllegalArgumentException("Wrong age");
        }
        yearOfBirth=year;
    }
}
