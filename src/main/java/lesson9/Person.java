package lesson9;

public class Person {
    private String name;
    private String lastName;
    private int yearOfBirth;

    public Person(){};

    public Person(String name,String lastName, int yearOfBirth){
        this.name=name;
        this.lastName=lastName;
        this.yearOfBirth=yearOfBirth;
    }

    public String getNAme(){
        return name;
    }

    public void setName(String newName){
        this.name=newName;
    }

    public void setLastName(String newLastName){
        this.lastName=newLastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth>2021||yearOfBirth<1900){
            throw new IllegalArgumentException("Wrong age");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
