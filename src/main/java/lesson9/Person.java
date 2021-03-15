package lesson9;


public class  Person {
    private String name;
    private String lastName;
    private int yearOfBirth;

    public Person(String name, String lastName,int yearOfBirth){
        this.name=name;
        this.lastName=lastName;
        this.yearOfBirth=yearOfBirth;
    }
    public Person(){}
    public Person (String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }
    public Person(String name){
        this.name=name;
    }
//    public Person(String lastName){
//        this.lastName=lastName;
//    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setYearOfBirth(int year){
        if(year>2021 || year<1900){
            throw new IllegalArgumentException("Wrong age");
        }
        yearOfBirth=year;
    }
}
