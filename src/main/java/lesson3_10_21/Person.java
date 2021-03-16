package lesson3_10_21;

public class Person {
    private String name;
    private String lastname;
    private int yearOfBirth;

    public String getName() {
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String l){
        lastname=l;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void setYearOfBirth(int year){
        if(year>2021 || year<1900){
            throw new IllegalArgumentException("Wrong age");
        }
        yearOfBirth=year;
    }

}
